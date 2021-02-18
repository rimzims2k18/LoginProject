<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  response.setHeader("cache-Control","no-cache,no-store,must-revalidate");
  if(session.getAttribute("username")==null){
	  response.sendRedirect("login.jsp");
  }
%>
Welcome ${username}<br>
<a href="video.jsp">Videos</a><br>

<form action="Logout">
<input type="submit" value="logout">
</form>
</body>
</html>