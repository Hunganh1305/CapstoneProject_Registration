<%-- 
    Document   : projectDetailLecturer
    Created on : 02/07/2022, 1:45:23 PM
    Author     : HLong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <title>Dashboard - All Topics</title>

        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Lato:700%7CMontserrat:400,600" rel="stylesheet">

        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />

        <!-- Font Awesome Icon -->
        <script src="https://kit.fontawesome.com/e7ea130b87.js" crossorigin="anonymous"></script>

        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="css/style.css" />

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
                          <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
                          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
                        <![endif]-->

    </head>
    <body>

        <%
            String name = (String) session.getAttribute("name");
            if (name == null) {
                response.sendRedirect("Login.jsp");
            } else {
        %>

        <!-- Header -->
        <header id="header">
            <div class="container">

                <div class="navbar-header">
                    <!-- Logo -->
                    <div class="navbar-brand">
                        <a class="logo" href="profileLecturer.jsp">
                            <img src="./img/logo.png" alt="logo">
                        </a>
                    </div>
                    <!-- /Logo -->

                    <!-- Mobile toggle -->
                    <button class="navbar-toggle">
                        <span></span>
                    </button>
                    <!-- /Mobile toggle -->
                </div>

                <!-- Navigation -->
                <nav id="nav">
                    <ul class="main-menu nav navbar-nav navbar-right">
                        <li><a class="align-nav" href="./profileLecturer.jsp">Profile</a></li>
                        <li><a class="align-nav" href="./projectListLecturer.jsp">Project List</a></li>
                        <li><a class="align-nav" href="./topicListLecturer.jsp">Topic List</a></li>
                        <li class="nav-item dropdown">
                            <a href="./profileLecturer.jsp" role="button" aria-haspopup="true" aria-expanded="false">
                                <img class="avatar" src="./img/sample-avatar.jpg" alt="Avatar">
                            </a>
                        </li>
                    </ul>
                </nav>
                <!-- /Navigation -->

            </div>
        </header>
        <!-- /Header -->

        <!--content-->
        <section id="project">
            <div class="container">
                <div class="project-title">
                    <h1 style="text-align: left">@Team Name - @Team ID</h1>
                </div>

                <div class="project-contents">
                    <div class="project-left">
                        <div class="project-content">
                            <h6 class="project-name">Team information</h6>
                            <hr>
                            <ul class="project-list">
                                <li class="project-item">
                                    <i class="fa fa-solid fa-bars col-sm-1"></i>
                                    <span class="col-sm-4">Team name</span>
                                    <span class="col-sm-7">ABCD</span>
                                </li>
                                <li class="project-item">
                                    <i class="fa-solid fa-clone col-sm-1"></i>
                                    <span class="col-sm-4">Joining code</span>
                                    <span class="col-sm-7">2xhbx</span>
                                </li>
                                <li class="project-item">
                                    <i class="fa-solid fa-clone col-sm-1"></i>
                                    <span class="col-sm-4">Topic</span>
                                    <span class="col-sm-7">Research And Developing Brands</span>
                                </li>
                                <li class="project-item">
                                    <i class="fa fa-regular fa-building col-sm-1"></i>
                                    <span class="col-sm-4">Department</span>
                                    <div class="col-sm-7">
                                        <span class="blue-box">Information System</span>
                                    </div>
                                </li>


                            </ul>
                            <div class="project-item" style="margin-top: 5px">
                                <i class="fa-solid fa-lock col-sm-1"></i>
                                <div class="col-sm-2">
                                    <span class="green-box">Locked</span>
                                </div>
                                <span class="col-sm-2"></span>
                                <i class="fa-solid fa-shield col-sm-1"></i>
                                <div class="col-sm-2">
                                    <span class="green-box">Public</span>
                                </div>
                            </div>

                        </div>
                    </div>

                    <div class="project-right">
                        <div class="project-content">
                            <h6 class="project-name">Team members</h6>
                            <hr>
                            <ul class="project-list">
                                <li class="project-item">
                                    <div class="col-sm-2">
                                        <img class="avatar" src="./img/sample-avatar.jpg" alt="Avatar">
                                    </div>
                                    <span>Nguyên Văn A</span>
                                </li>
                                <li class="project-item">
                                    <div class="col-sm-2">
                                        <img class="avatar" src="./img/sample-avatar.jpg" alt="Avatar">
                                    </div>
                                    <span>Nguyên Văn B</span>
                                </li>
                                <li class="project-item">
                                    <div class="col-sm-2">
                                        <img class="avatar" src="./img/sample-avatar.jpg" alt="Avatar">
                                    </div>
                                    <span>Phạm Văn C</span>
                                </li>
                                <li class="project-item">
                                    <div class="col-sm-2">
                                        <img class="avatar" src="./img/sample-avatar.jpg" alt="Avatar">
                                    </div>
                                    <span>Trần Thị D</span>
                                </li>
                            </ul>

                        </div>
                    </div>
                </div>


            </div>
        </section>

        <!--/content-->

        <!-- topic -->

        <footer id="footer" class="section">

            <!-- container -->
            <div class="container">

                <!-- row -->
                <div id="bottom-footer" class="row">

                    <!-- social -->
                    <div class="col-md-4 col-md-push-8">
                        <ul class="footer-social">
                            <li><a href="https://www.facebook.com/" class="facebook"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="https://twitter.com/" class="twitter"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#" class="google-plus"><i class="fa fa-google-plus"></i></a></li>
                            <li><a href="https://www.instagram.com/" class="instagram"><i class="fa fa-instagram"></i></a></li>
                            <li><a href="https://www.youtube.com/" class="youtube"><i class="fa fa-youtube"></i></a></li>
                            <li><a href="https://www.linkedin.com/" class="linkedin"><i class="fa fa-linkedin"></i></a></li>
                        </ul>
                    </div>
                    <!-- /social -->

                    <!-- copyright -->
                    <div class="col-md-8 col-md-pull-4">
                        <div class="footer-copyright">
                            <span>&copy; Copyright 2022. All Rights Reserved. | FPT University </span>
                        </div>
                    </div>
                    <!-- /copyright -->

                </div>
                <!-- row -->

            </div>
            <!-- /container -->

        </footer>

        <% }
        %>

        <script src="./js/topic.js"></script>
        <script type="text/javascript" src="js/jquery.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/main.js"></script>
    </body>
</html>