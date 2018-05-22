
<%@page import="Bean.Train"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="FindTrainAction.jsp">
<table>
	<tr>
		<td>Train Name</td>
		
		<td>
		<select name="selectBtn">
			<option>lucknow-pune</option>
			<option>mumbai-delhi</option>
			<option>pune-baroda</option>
		</select>
		</td>
		
	</tr>
	
		<td><input type="submit" value="Add" /></td>
		<td><input type="reset" value="Cancel" /></td>
	</tr>
</table>
<br><br>

</form>
</body>
</html>