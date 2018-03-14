<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Email List</title>
	</head>

	<body>
	
		<h1>Welcome to our e mail list :)</h1>
		<%@ page import="data.userIO" %>
		<%
	
		String name =  request.getParameter("username");
		String email = request.getParameter("email");

		business.user user1=new business.user(name,email);
		
		ServletContext sc= getServletContext();

		userIO.write(user1,sc.getRealPath("/WEB-INF/info.txt"));
	
		%>
	
		<p> Welcome <%= user1.getName() %> to our email list. Your email is <%= user1.getEmail() %> Welcome to our list :)</p>
	
	</body>

</html>