<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Know You</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body data-vide-bg="images/nature">
    <div class="layer"></div>
    <form method="post" action="checksupervisorlogin">
        <div class="form-header">
            <img src="images/logo.png" alt="logo">
            <h2>Lets Get Into The Work</h2>
            <h3>Please Provide Your Credentials</h3>
        </div>
          <span class="blink">
  				<h3 align=center style="color: red"><c:out value="${msg}"/></h3>
 		 </span>
        
        <div class="input-container">
            <input type="text" name="auname" placeholder="Enter Username" required="required">
        </div>
        <div class="input-container">
            <input type="password" name="apwd" placeholder="Enter Password" required="required">
        </div>
        <div class="input-container">
            <input type="submit" value="Login">
        </div>
        <div class="link-container">
            <a href="#">Forget password ?</a>
        </div>
    </form>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="js/jquery.vide.js"></script>
</body>
</html>