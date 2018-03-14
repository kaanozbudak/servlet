package business;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;


public class LoginServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
		{
			String userName = req.getParameter("user");
			String pass = req.getParameter("password");
			
			business.user user1 = new business.user(userName,pass);

			if 	("kozbu".equals(userName) && "rosekaan1".equals(pass)) 
			{
				response(resp, "login ok")	;
			} 
			else 
			{
				response(resp, "wrong login");
			}

			RequestDispatcher rd= getServletContext().getRequestDispatcher("/reply.jsp");
			req.setAttribute("user",user1);
			rd.forward(req, resp);

			ServletContext sc= getServletContext();

			data.userIO.write(user1,sc.getRealPath("/WEB-INF/info.txt"));	
			
		}	

	private void response(HttpServletResponse resp, String msg)	throws IOException 
	{
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<t1>" + msg + "</t1>");
		out.println("</body>");
		out.println("</html>");
	}
}