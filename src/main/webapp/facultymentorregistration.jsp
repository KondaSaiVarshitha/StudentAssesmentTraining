<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Know You</title>
   
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/js/bootstrap.bundle.min.js" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js" rel="stylesheet">
    <link href="css/registrationcss.css" rel="stylesheet">
</head>
<body>
    <div class="container d-flex justify-content-center align-items-center">
        <div class="card">
            <div class="row">
                <div class="col-md-6">
                    <form:form method="post" action="addmentor" modelAttribute="mentor">
                    	<div class="form">
                        <h2>Registration</h2>
                        <div class="inputbox mt-3"> <span>Name</span>
                         <form:input path="name"  class="form-control" required="required" placeholder="Enter Your Name"></form:input> 
                        </div>
                        <div class="inputbox mt-3"> <span>Gender: </span>&nbsp;&nbsp;&nbsp;&nbsp;
                        	<form:radiobutton path="gender"  value="Male" required="required"/>Male&nbsp;&nbsp;
							<form:radiobutton path="gender" value="Female" required="required"/>Female
						</div>
						<div class="inputbox mt-3"> <span>Department:</span>&nbsp;&nbsp;&nbsp;&nbsp;<form:select path="department"  class="form-control" required="required">
							<form:option value="-1">---Select---</form:option>
							<form:option value="CSE">CSE</form:option>
							<form:option value="ECE">ECE</form:option>
							<form:option value="MECH">MECH</form:option>
							<form:option value="CIVIL">CIVIL</form:option>
							</form:select>
						</div>
						<div class="inputbox mt-3"> <span>Program:</span>&nbsp;&nbsp;&nbsp;&nbsp;<form:select path="program"  class="form-control" required="required">
							<form:option value="-1">---Select---</form:option>
							<form:option value="B.Tech">B.Tech</form:option>
							<form:option value="M.Tech">M.Tech</form:option>
							<form:option value="Ph.D">Ph.D</form:option>
							</form:select>
						</div>
						<div class="inputbox mt-3"> <span>Designation:</span>&nbsp;&nbsp;&nbsp;&nbsp;<form:select path="designation"  class="form-control" required="required">
							<form:option value="-1">---Select---</form:option>
							<form:option value="B.Tech">B.Tech</form:option>
							<form:option value="M.Tech">M.Tech</form:option>
							<form:option value="Ph.D">Ph.D</form:option>
							</form:select>
						</div>
                         <div class="inputbox mt-3"> <span>Email</span>
                         <form:input path="email"  class="form-control" required="required" placeholder="Enter Email"></form:input> 
                        </div>
                         <div class="inputbox mt-3"> <span>Contact No</span>
                         <form:input path="contactno"  class="form-control" required="required" placeholder="Enter Contact"></form:input> 
                        </div>
                         <div class="inputbox mt-3"> <span>Username</span>
                         <form:input path="username"  class="form-control" required="required" placeholder="Enter username"></form:input> 
                        </div>
                         <form:input path="password"  class="form-control" required="required" value="2022" readonly="true" hidden="true"></form:input> 
                    
                        <div class="d-flex justify-content-between align-items-center">
                        
                            <div class="text-right"><input type="submit"  value="Register" class="btn btn-success register btn-block"/> </div>
                        </div>
                        <div class="form-check mt-2"> <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked" checked> <label class="form-check-label" for="flexCheckChecked"> I agree to the terms and conditions of <a href="" class="login">Privacy & Policy</a> </label> </div>
                    </div>
                    </form:form>
                </div>
                <div class="col-md-6">
                    <div class="text-center mt-5"> <img src="images/slider.png" width="400"> </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>