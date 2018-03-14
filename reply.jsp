<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Email List</title>
	</head>

	<body>
		<%@ page import = "business.user" %>
		<%@ page import = "data.userIO" %>
		<h1>Welcome to our e mail list :)</h1>
		
		<%

		user user1 = (user) request.getAttribute("user");

		//String path = getServletContext().getRealPath("/")+"info.txt";
		
		
		//ServletContext sc= getServletContext();

		//userIO.write(user1,sc.getRealPath("/WEB-INF/info.txt"));
		
		%>
	
		<p> Welcome <%= user1.getName() %> to our email list. Your email is <%= user1.getEmail() %> Welcome to our list :)</p>
	
	</body>

</html>