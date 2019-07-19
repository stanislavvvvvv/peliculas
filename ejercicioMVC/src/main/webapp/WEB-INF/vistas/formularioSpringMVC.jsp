<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home de spring mvc</title>
</head>
<body>
	<marquee>
		<h1>AÑADE UNA PELICULA</h1>
	</marquee>
	<form action="muestramelo">
		Titulo: <input type="text" name="titulo"><br>
		Director: <input type="text" name="director"><br>
		Sinopsis: <input type="text" name="sinopsis"><br>
		Categorias: <input type="text" name="categorias"><br>
		<input type="submit" value="DAR DE ALTA">
	</form>
</body>
</html>