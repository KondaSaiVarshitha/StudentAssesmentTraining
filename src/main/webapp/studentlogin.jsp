<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Animated Background Login Screen</title>
  <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css'><link rel="stylesheet" href="./style.css">
	<link rel="stylesheet" href="css/login.css">
</head>
<body>
<!-- partial:index.partial.html -->
<div class="container">
	<div id="login-box">
		<div class="logo">
			<img src="images/logo.png" class="img img-responsive img-circle center-block"/>
			<h1 class="logo-caption"><span class="tweak">L</span>ogin</h1>
			<h3 align=center style="color: red"><c:out value="${msg}"/></h3>
		</div><!-- /.logo -->
		<form method="post" action="checkstudentlogin">
			
			<div class="controls">
			<input type="radio" id="s1" name="status" value="student"/>&nbsp;
			<label for="s1" style="color:white">Student</label>&nbsp;
			<input type="radio" id="s2" name="status" value="faculty"/>&nbsp;
			<label for="s2" style="color:white">Faculty</label>&nbsp;
			<input type="radio" id="s3" name="status" value="trainer"/>
			<label for="s3" style="color:white">Trainer</label>&nbsp;
			<input type="radio" id="s4" name="status" value="supervisor"/>
			<label for="s4" style="color:white">Supervisor</label>&nbsp;
			
			<input type="text" name="suname" placeholder="Username" class="form-control" required="required"/>
			<br>
			<input type="text" name="spwd" placeholder="Password" class="form-control" required="required"/>
			<br>	
           <input type="submit" value="Login" class="btn btn-default btn-block btn-custom"/>
            <a href="#" style="color:white;"  href="#"> Forget password? </a> 
		</div>
		</form>
	</div>
</div>
<div id="particles-js"></div>
<!-- partial -->
  <script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css'></script>
<script src='https://code.jquery.com/jquery-1.11.1.min.js'></script><script  src="./script.js"></script>
<script src="js/login.js"></script>
</body>
</html>

