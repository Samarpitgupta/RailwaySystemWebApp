
<%@page import="model.GetFreePlatform"%>
<%@page import="Bean.Platform"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

<h2> FREE PLATFORM </h2>

<% 
Platform p = new Platform();
GetFreePlatform gft= new GetFreePlatform();
p = gft.getFreePlatform();
if (p == null){
	out.println("No platform is available");
}
else{
	out.println("Platform Number : "+p.getPlatNo() + " is free.");
}
%><br>





</body>
</html>