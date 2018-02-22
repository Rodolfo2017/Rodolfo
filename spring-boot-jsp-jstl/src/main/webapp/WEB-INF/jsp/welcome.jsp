<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mi primera página</title>
</head>
<body>
	<h2>${message}</h2><br/>
	<c:out value="${message}"/>
	
	<table border="1">
		<tr>
			<td> IdPersona</td>
			<td> Nombres</td>
			<td> Apellidos</td>
			<td> Telefono</td>
			<td> Direccion</td>
		</tr>
		<c:forEach items="${lista}" var="fila">
			
				<tr>
					<td>${fila.idPersona}</td>
					<td>${fila.nombres}</td>
					<td>${fila.apellidos}</td>
					<td>${fila.telefono}</td>
					<td>${fila.direccion}</td>
				</tr>
				
		</c:forEach>		
	
	</table>
	<br/>	
	  <jsp:useBean id="now" class="java.util.Date" />
	  <c:out value="${now}"></c:out>
	<form method="POST">
		Nombres: <input type="text" name="nombres" id="nombres"/><br/>
		Apellidos: <input type="text" name="apellidos" id="apellidos"/><br/>
		Telefono: <input type="text" name="telefono" id="telefono"/><br/>
		Direccion: <input type="text" name="direccion" id="direccion"/><br/><br/>
		<input type="submit" value="Guardar"/> 	
	</form>
</body>
</html>