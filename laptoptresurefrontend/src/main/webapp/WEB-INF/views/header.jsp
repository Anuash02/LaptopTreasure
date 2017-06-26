<%@ page contentType="text/html; charset=utf-8" language="java"
	import="java.sql.*" errorPage=""%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Navbar Example</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
	<!-- -Starting the navbar code -->
	<nav class="navbar navbar-inverse">
		<div-class="container-fluid"> <div-class="navbar-header">
		<a class="navbar-brand" href="index.jsp">E-kart</a>
		</div>

		<ul class="nav navbar-nav">
			<li class="active"><a href="index.jsp"><span class="glyphicon glyphicon-home"></span>Home</a></li>
			<li><a href="Login">Login</a></li>
			<li><a href="Register.jsp">Register</a></li>
			<li><a href="Aboutus.jsp">About us</a></li>
			<li><a href="Contactus.jsp">Contact us</a></li>
			
		</ul>
	</nav>

	<div class="nav navbar nav navbar-right">
		<a href="#">Sign In</a>
	</div>

</body>
</html>