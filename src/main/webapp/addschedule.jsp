<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,500,600,700,800,900" rel="stylesheet">

    

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">


    <!-- Additional CSS Files -->
    <link rel="stylesheet" href="css/fontawesome.css">
    <link rel="stylesheet" href="css/templatemo-edu-meeting.css">
    <link rel="stylesheet" href="css/owl.css">
    <link rel="stylesheet" href="css/lightbox.css">
</head>
<body >

  
  <!-- ***** Header Area Start ***** -->
  <header class="header-area header-sticky">
      <div class="container">
          <div class="row">
              <div class="col-12">
                  <nav class="main-nav">
                      <!-- ***** Logo Start ***** -->
                      <a href="trainerhome" class="logo">
                          KNOW YOU
                      </a>
                      <!-- ***** Logo End ***** -->
                      <!-- ***** Menu Start ***** -->
                      <ul class="nav">
                          <li class="scroll-to-section"><a href="trainerhome" class="active"></a></li>
                          <li><a href="meetings.html">Training</a></li>
                          
                        
                          <li class="has-sub">
                              <a href="javascript:void(0)">Schedules</a>
                              <ul class="sub-menu">
                                  <li><a href="setSchedule">Add Schedules</a></li>
                                  <li><a href="meeting-details.html">View Schedules</a></li>
                              </ul>
                          </li>
                          <li><a href="studentprofiles.jsp">Student Profiles</a></li>
                          
                          <li class="scroll-to-section"><a href="#contact">Contact Us</a></li> 
                          <li ><a href="trainerlogout">Logout</a></li> 
                      </ul>        
                      <a class='menu-trigger'>
                          <span>Menu</span>
                      </a>
                      <!-- ***** Menu End ***** -->
                  </nav>
              </div>
          </div>
      </div>
  </header>
  <!-- ***** Header Area End ***** -->
	<div class="container" style="margin-top: 100px">

  <form:form class="well form-horizontal" action="addSchedule" method="post" modelAttribute="sch">
    <fieldset>

      <!-- Form Name -->
      <legend>
        <center>
          <h2><b>Add Schedule</b></h2>
        </center>
      </legend><br>

      <!-- Text input-->

      <div class="form-group">
        <label class="col-md-4 control-label">Start Date Of Event</label>
        <div class="col-md-4 inputGroupContainer">
          <div class="input-group">
            <span class="input-group-addon"></span>
            
            
            <form:input path="startdate"  class="form-control" ></form:input>
          </div>
        </div>
      </div>
      
      <div class="form-group">
        <label class="col-md-4 control-label">End Date Of Event</label>
        <div class="col-md-4 inputGroupContainer">
          <div class="input-group">
            <span class="input-group-addon"></span>
            
            
            <form:input path="enddate"  class="form-control" ></form:input>
          </div>
        </div>
      </div>
      <div class="form-group">
        <label class="col-md-4 control-label">Mode Of Conduct</label>
        <div class="col-md-4 inputGroupContainer">
          <div class="input-group">
            
            <label for="offline" style="margin-top: 10px">Offline</label>&nbsp;
            	<form:checkbox path="modeofconduct" id="offline" value="offline"/>
            	  <label for="online" style="margin-top: 10px">Online</label>&nbsp;
            	<form:checkbox path="modeofconduct" id="online" value="online"/>
          </div>
        </div>
      </div>
      <div class="form-group">
        <label class="col-md-4 control-label">Days of Event</label>
        <div class="col-md-4 inputGroupContainer">
          <div class="input-group">
            <span class="input-group-addon"></span>
            
            
            
            <form:textarea path="days" class="form-control"/>
          </div>
        </div>
      </div>

      <!-- Text input-->

      <div class="form-group">
        <label class="col-md-4 control-label">Name</label>
        <div class="col-md-4 inputGroupContainer">
          <div class="input-group">
            <span class="input-group-addon"></span>
            <form:input path="name" placeholder="Enter name of event" class="form-control"></form:input>
          </div>
        </div>
      </div>

    

      <!-- Text input-->

      <div class="form-group">
        <label class="col-md-4 control-label">Venue</label>
        <div class="col-md-4 inputGroupContainer">
          <div class="input-group">
            <span class="input-group-addon"></span>
            <form:input path="venue" placeholder="Enter Location" class="form-control"></form:input>
          </div>
        </div>
      </div>	

      <!-- Text input-->

      <div class="form-group">
        <label class="col-md-4 control-label">Description</label>
        <div class="col-md-4 inputGroupContainer">
          <div class="input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
            <form:textarea path="description" placeholder="Enter Description" class="form-control"></form:textarea>
          </div>
        </div>
      </div>

    

      
      <!-- Button -->
      <div class="form-group">
        <label class="col-md-4 control-label"></label>
        <div class="col-md-4"><br>
         	<input  type="submit" value="submit"/>
        </div>
      </div>

    </fieldset>
  </form:form>
</div>
</div><!-- /.container -->
<script>
$(document).ready(function() {
    $('#contact_form').bootstrapValidator({
        // To use feedback icons, ensure that you use Bootstrap v3.1.0 or later
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            first_name: {
                validators: {
                        stringLength: {
                        min: 2,
                    },
                        notEmpty: {
                        message: 'Please enter your First Name'
                    }
                }
            },
             last_name: {
                validators: {
                     stringLength: {
                        min: 2,
                    },
                    notEmpty: {
                        message: 'Please enter your Last Name'
                    }
                }
            },
			 user_name: {
                validators: {
                     stringLength: {
                        min: 8,
                    },
                    notEmpty: {
                        message: 'Please enter your Username'
                    }
                }
            },
			 user_password: {
                validators: {
                     stringLength: {
                        min: 8,
                    },
                    notEmpty: {
                        message: 'Please enter your Password'
                    }
                }
            },
			confirm_password: {
                validators: {
                     stringLength: {
                        min: 8,
                    },
                    notEmpty: {
                        message: 'Please confirm your Password'
                    }
                }
            },
            email: {
                validators: {
                    notEmpty: {
                        message: 'Please enter your Email Address'
                    },
                    emailAddress: {
                        message: 'Please enter a valid Email Address'
                    }
                }
            },
            contact_no: {
                validators: {
                  stringLength: {
                        min: 12, 
                        max: 12,
                    notEmpty: {
                        message: 'Please enter your Contact No.'
                     }
                }
            },
			 department: {
                validators: {
                    notEmpty: {
                        message: 'Please select your Department/Office'
                    }
                }
            },
                }
            }
        })
        .on('success.form.bv', function(e) {
            $('#success_message').slideDown({ opacity: "show" }, "slow") // Do something ...
                $('#contact_form').data('bootstrapValidator').resetForm();

            // Prevent form submission
            e.preventDefault();

            // Get the form instance
            var $form = $(e.target);

            // Get the BootstrapValidator instance
            var bv = $form.data('bootstrapValidator');

            // Use Ajax to submit form data
            $.post($form.attr('action'), $form.serialize(), function(result) {
                console.log(result);
            }, 'json');
        });
});</script>
</body>
</html>