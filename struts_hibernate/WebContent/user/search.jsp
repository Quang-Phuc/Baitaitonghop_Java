<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	
</head>
<body>
	<html:form action="/user" >
		
		<table>
			<tr>
				<td>User name</td>
				<td><html:text property="name" size="20" /></td>
				<td ><html:button value="Search" property="" /></td>
			</tr>
			
		</table>
	</html:form>

</body>
</html>