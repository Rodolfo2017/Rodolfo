<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Datos de la persona</title>
</head>
<body>
	<form method="POST" action="/usuario">
	<h2>Nombres: ${nombres}</h2><br/>
	<h2>Apellidos: ${apellidos}</h2><br/>
	<h2>Telefono: ${telefono}</h2><br/>
	<h2>Direccion: ${direccion}</h2><br/>
	
		<input type="submit" value="Regresar"/>
	</form>
</body>
</html>