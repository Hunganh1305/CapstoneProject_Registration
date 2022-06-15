<%-- 
    Document   : teamList
    Created on : Jun 15, 2022, 8:45:26 AM
    Author     : phamquang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Dashboard - Profile</title>

        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Lato:700%7CMontserrat:400,600" rel="stylesheet">

        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />

        <!-- Font Awesome Icon -->
        <script src="https://kit.fontawesome.com/e7ea130b87.js" crossorigin="anonymous"></script>

        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="./css/style.css" />

        <!-- topic stylessheet -->
        <link type="text/css" rel="stylesheet" href="./css/topicTeamListStyle.css" />
    </head>

    <body>
        <!-- Header -->
        <header id="header">
            <div class="container">

                <div class="navbar-header">
                    <!-- Logo -->
                    <div class="navbar-brand">
                        <a class="logo" href="index.html">
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
                        <li><a class="align-nav" href="./project.html">Project</a></li>
                        <li><a class="align-nav" href="./topic.html"/>Topic</a></li>
                        <li><a class="align-nav" href="./teamList.html">Team List</a></li>
                        <li><a class="align-nav" href="./contact.html">Contact</a></li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
                                <img class="avatar" src="./img/sample-avatar.jpg" alt="Avatar">
                            </a>
                            <div class="dropdown-menu">
                                <br>
                                <a class="dropdown-item" href="./profile.html">
                                    <span style="margin-right: 4px;" class="fa-solid fa-user fa-md"></span>
                                    <span>Profile</span>
                                </a>
                                <hr>
                                <a class="'dropdown-item" href="#">
                                    <span style="margin-right: 3px;" class="fa-solid fa-right-from-bracket fa-md"></span>
                                    <span>Logout</span>
                                </a> 
                                <br>
                            </div>
                        </li>
                    </ul>
                </nav>
                <!-- /Navigation -->


            </div>
        </header>
        <!-- /Header -->

        <!-- topic -->
        <section id="topic" class="container">

            <div class="teamListControl">
                <div class="topic__title">
                    <h1>Team List</h1>
                </div>
                <div class="btnControl">

                    <button class="team__btn">+ Create A New Team</button>
                </div>

            </div>
            <div class="topic__container">

                <h6 class="topic__text">
                    All of public and unlocked teams in semester SU2022_SWP
                </h6>

                <hr>

                <div class="topic__search">
                    <form action="">
                        <input placeholder=" " class="search__input" type="text">
                        <label for="search" class="search__label">Search by team name</label>
                        <button type="submit" class="search-btn ">
                            <img src="img/search-interface-symbol.png" alt="">
                        </button>
                    </form>

                    <div class="topic__filter">
                        <i class="fa fa-regular fa-filter"></i>Filters
                        <div class="dropdown1">
                            <ul class="filter__list">
                                <li class="filter__item">Quan tri kinh doanh</li>
                                <li class="filter__item">Cong nghe thong tin</li>
                                <li class="filter__item">Ngon ngu Anh</li>
                                <li class="filter__item">Ngon ngu Han Quoc</li>
                                <li class="filter__item">Ngon ngu Nhat</li>
                            </ul>
                        </div>
                    </div>

                </div>

                <table class="table topic__table">
                    <thead>
                        <tr>
                            <th>DEP.</th>
                            <th>TEAMNAME</th>
                            <th>LEADER</th>
                            <th>MEMBER(s)</th>
                            <th>STATUS</th>
                            <th>ACTION</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>IS</td>
                            <td>Polycell</td>
                            <td>[SE161502] Vũ Anh Thuyên</td>
                            <td>
                                <span class="tdTbl__warning"> 2/6</span>
                            </td>
                            <td>
                                <span class="tdTbl__warning">Unlocked</span>
                            </td>
                            <td><a href="teamDetail.html"><i class="fa fa-solid fa-eye"></i></a></td>
                        </tr>
                        <tr>
                            <td>SE</td>
                            <td>BeakyBlinders</td>
                            <td>[SE161497] Lê Hải Long</td>
                            <td><span class="tdTbl__success"> 2/6</span></td>
                            <td><span class="tdTbl__warning">Unlocked</span></td>
                            <td><a href="teamDetail.html"><i class="fa fa-solid fa-eye"></i></a></td>
                        </tr>
                        <tr>
                            <td>IS</td>
                            <td>Polycell</td>
                            <td>[SE161502] Vũ Anh Thuyên</td>
                            <td><span class="tdTbl__warning"> 2/6</span></td>
                            <td><span class="tdTbl__warning">Unlocked</span></td>
                            <td><a href="teamDetail.html"><i class="fa fa-solid fa-eye"></i></a></td>
                        </tr>
                        <tr>
                            <td>IS</td>
                            <td>Polycell</td>
                            <td>[SE161502] Vũ Anh Thuyên</td>
                            <td><span class="tdTbl__warning"> 2/6</span></td>
                            <td><span class="tdTbl__warning">Unlocked</span></td>
                            <td><a href="teamDetail.html"><i class="fa fa-solid fa-eye"></i></a></td>
                        </tr>
                        <tr>
                            <td>IS</td>
                            <td>Polycell</td>
                            <td>[SE161502] Vũ Anh Thuyên</td>
                            <td><span class="tdTbl__warning"> 2/6</span></td>
                            <td><span class="tdTbl__warning">Unlocked</span></td>
                            <td><a href="teamDetail.html"><i class="fa fa-solid fa-eye"></i></a></td>
                        </tr>
                    </tbody>
                </table>

                <hr>

                <nav aria-label="pagination Page navigation example">
                    <ul class="pagination justify-content-center">
                        <li class="page-item disabled">
                            <a class="page-link" href="#" tabindex="-1">Previous</a>
                        </li>
                        <li class="page-item"><a class="page-link" href="#">1</a></li>
                        <li class="page-item"><a class="page-link" href="#">2</a></li>
                        <li class="page-item"><a class="page-link" href="#">3</a></li>
                        <li class="page-item">
                            <a class="page-link" href="#">Next</a>
                        </li>
                    </ul>
                </nav>

            </div>


        </section>
        <!-- topic -->

        <footer id="footer" class="section">

            <!-- container -->
            <div class="container">

                <!-- row -->
                <div id="bottom-footer" class="row">

                    <!-- social -->
                    <div class="col-md-4 col-md-push-8">
                        <ul class="footer-social">
                            <li><a href="#" class="facebook"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="#" class="twitter"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#" class="google-plus"><i class="fa fa-google-plus"></i></a></li>
                            <li><a href="#" class="instagram"><i class="fa fa-instagram"></i></a></li>
                            <li><a href="#" class="youtube"><i class="fa fa-youtube"></i></a></li>
                            <li><a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a></li>
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
        <script src="./js/topic.js"></script>
        <script type="text/javascript" src="js/jquery.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/main.js"></script>
    </body>

</html>