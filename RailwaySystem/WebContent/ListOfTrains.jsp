<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4 align = "center">List All Trains</h4>
<table border=1>
<tr><th>TrainName</th><th>ArrivalTime</th><th>Wait Status</th></tr>
<c:forEach var="objTrain"  items="${listofTrain }">
<tr style = "background-color:lightgrey ">
<td style = "background-color:grey ">
<c:out value="${objTrain.trainName }"></c:out></td>
<td><c:out value="${objTrain.arrTime }"></c:out></td>
<td><c:out value="${objTrain.waitStatus }"></c:out></td>
<td><button>Depart</button></td>
</tr>
</c:forEach>

</table>




</body>
</html>