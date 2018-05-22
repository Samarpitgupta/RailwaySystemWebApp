<%@page import="model.FindTrains"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@page import="Bean.Train"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>

<h2> List of Train that has been arrived</h2>
	<table border="1">
		<tr>
			<td>Train_Name:</td>
		</tr>
		
		
		<%
	     Train train=new Train();
		
		FindTrains ft =new FindTrains();
		train=ft.findTrain(request.getParameter("selectBtn"));
			%>
		
			<td> <%= train.getTrainName() %></td>
	</table>

</form>
</body>
</html>