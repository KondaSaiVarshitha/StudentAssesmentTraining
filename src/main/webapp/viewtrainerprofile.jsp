<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Know You</title>
  <!-- Favicons -->
  <link href="images/favicon.png" rel="icon">
  <link href="images/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="css/vendor/aos/aos.css" rel="stylesheet">
  <link href="css/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="css/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="css/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="css/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="css/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="css/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="css/supervisorhomestyle.css" rel="stylesheet">
  <style>
  	.profile
  	{
  		background-color: grey;
  	}
  
  </style>
</head>
<body>


  <!-- ======= Header ======= -->
  <header id="header" class="fixed-top ">
    <div class="container d-flex align-items-center justify-content-lg-between">

      <!-- Uncomment below if you prefer to use an image logo -->
      <a href="index.html" class="logo me-auto me-lg-0"><img src="logo.png" alt="" class="img-fluid"></a>

      <nav id="navbar" class="navbar order-last order-lg-0">
        <ul>
          <li><a  href="supervisorhome">Home</a></li>
          <li  class="dropdown"><a href="#"><span></span>Student<i class="bi bi-chevron-down"></i></a>
            <ul>
              <li><a href="studentreg">Add New Student</a></li>
              <li class="dropdown"><a><span>View All Students</span> <i class="bi bi-chevron-right"></i></a>
                <ul>
                  <li><a href="studentlist">Profile Details</a></li>
                  <li><a href="#">Training Report</a></li>
                </ul>
              </li>
              <li><a href="#">Update Student Profile</a></li>
            </ul>
          </li>
          <li class="dropdown"><a ><span></span>Faculty Mentor<i class="bi bi-chevron-down"></i></a>
            <ul>
              <li><a href="mentorreg">Add New Faculty Mentor</a></li>
              <li><a href="mentorlist">View All Faculty Mentors</a></li>
              <li><a href="#">Update Faculty Mentor profile</a></li>
            </ul>
          </li>
          <li class="dropdown"><a href="#"><span></span>Trainer<i class="bi bi-chevron-down"></i></a>
            <ul>
              <li><a href="trainerreg">Add New Trainer</a></li>
              <li><a href="trainerlist">View All Trainers</a></li>
              <li><a href="#">Update Trainer profile</a></li>
            </ul>
          </li>
           <li class="dropdown"><a href="logout"><span></span>Logout</a></li>
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav><!-- .navbar -->

      <a href="#about" class="get-started-btn scrollto">Hi,<c:out value="${auname}"></c:out></a>

    </div>
  </header><!-- End Header -->

  <!-- ======= Hero Section ======= -->
  <section id="hero" class="d-flex align-items-center justify-content-center" >
  			
    <div class="container" data-aos="fade-up">
<ul class="profile">


<li> <c:out value="${t.id}"></c:out>   </li>
<li>  <c:out value="${t.name}"></c:out>   </li>
<li>  <c:out value="${t.gender}"></c:out>   </li>
<li>  <c:out value="${t.department}"></c:out>   </li>
<li>  <c:out value="${t.program}"></c:out>   </li>
<li>  <c:out value="${t.designation}"></c:out>   </li>
<li>  <c:out value="${t.email}"></c:out>   </li>
<li>  <c:out value="${t.username}"></c:out>   </li>
<li>  <c:out value="${t.contactno}"></c:out>   </li>


</ul>

	</div>
     
  </section><!-- End Hero -->

  <main id="main">

  </main><!-- End #main -->



  <div id="preloader"></div>
  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="css/vendor/purecounter/purecounter_vanilla.js"></script>
  <script src="css/vendor/aos/aos.js"></script>
  <script src="css/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="css/vendor/glightbox/js/glightbox.min.js"></script>
  <script src="css/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="css/vendor/swiper/swiper-bundle.min.js"></script>
  <script src="css/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="js/main.js"></script>


</body>
</html>

 
