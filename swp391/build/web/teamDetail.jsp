<%-- 
    Document   : teamDetail
    Created on : Jun 15, 2022, 8:46:18 AM
    Author     : phamquang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Dashboard - TeamDetail</title>

        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Lato:700%7CMontserrat:400,600" rel="stylesheet">

        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />

        <!-- Font Awesome Icon -->
         <link rel="stylesheet" href="css/font-awesome.min.css"> 

        <!-- cdn font awesome -->
<!--        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
              integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />-->

        <!-- Custom stylesheet -->
        <link type="text/css" rel="stylesheet" href="./css/style.css" />

        <!--  stylessheet -->
        <link type="text/css" rel="stylesheet" href="./css/teamDetail.css" />
    </head>

    <body>
        
        <%
            String name = (String) session.getAttribute("name");
            if (name == null) {
                response.sendRedirect("Login.jsp");
            } else {
        %>
        
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
                        <li><a class="align-nav" href="./topic.html" >Topic</a></li>
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

        <!-- topic -->
        <section id="team" class="container">
            <div class="team__header">
                <h2>Team detail</h2>
                <div class="btnControl">
                    <button class="team__btn">
                        <i class="fa-solid fa-right-to-bracket"></i> Quick Join A Team</button>
                </div>
            </div>
            <!-- <div class="team__breadcrumb">
                <ol class="col-12 breadcrumb">
                    <li class="breadcrumb-item"><a href="#">Dashboard</a></li>
                    <li class="breadcrumb-item"><a href="#">SU2022_SWP</a></li>
                    <li class="breadcrumb-item"><a href="teamList.html">Teams</a></li>
                    <li class="breadcrumb-item active">Team detail</li>
                </ol>
            </div> -->

            <div class="teamControl">

                <div>
                    <table class="table teamMember">
                        <thead>
                            <tr>
                                <th>Team members</th>
                                <th> </th>
                                <th> </th>
                                <th><span class="tdTbl__success"> 6/6</span></th>
                            </tr>
                        </thead>
                        <tbody class="teamMemberBody row">
                            <tr class="col-sm-12">
                        <div>
                            <td class="">
                                <a href="profile.html"><img class="avatar" src="./img/sample-avatar.jpg"
                                                            alt="Avatar"></a>
                            </td>
                            <td>Le Hai Long <br />
                                SE161497 <br />

                            </td>
                        </div>

                        <div>
                            <td class="tabProgramControl">
                                <span class="tabProgram">Java</span>
                                <span class="tabProgram">Web</span>
                                <span class="tabProgram">C#</span>
                                <span class="tabProgram">Backend</span>
                            </td>
                        </div>
                        </tr>
                        </tbody>
                        <tbody class="teamMemberBody row">
                            <tr class="col-sm-12">
                        <div>
                            <td class="">
                                <a href="profile.html"><img class="avatar" src="./img/sample-avatar.jpg"
                                                            alt="Avatar"></a>
                            </td>
                            <td>Le Hai Long <br />
                                SE161497 <br />
                                <span class="tdTbl__danger">Leader</span>
                            </td>
                        </div>

                        <div>
                            <td class="tabProgramControl">
                                <span class="tabProgram">Java</span>
                                <span class="tabProgram">Web</span>
                                <span class="tabProgram">C#</span>
                                <span class="tabProgram">Backend</span>
                            </td>
                        </div>
                        </tr>
                        </tbody>
                        <tbody class="teamMemberBody row">
                            <tr class="col-sm-12">
                        <div>
                            <td class="">
                                <a href="profile.html"><img class="avatar" src="./img/sample-avatar.jpg"
                                                            alt="Avatar"></a>
                            </td>
                            <td>Le Hai Long <br />
                                SE161497 <br />

                            </td>
                        </div>

                        <div>
                            <td class="tabProgramControl">
                                <span class="tabProgram">Java</span>
                                <span class="tabProgram">Web</span>
                                <span class="tabProgram">C#</span>
                                <span class="tabProgram">Backend</span>
                            </td>
                        </div>
                        </tr>
                        </tbody>



                    </table>
                </div>
                <!--  -->
                <div>
                    <table class="table teamInfor">
                        <thead>
                            <tr>
                                <th>Team information</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td class="tdControl">
                                    <div>
                                        <i class="fa  fa-bars"></i>
                                        Team name: <strong>BeakyBlinders</strong>
                                    </div>
                                    <div class="join">
                                        <i class="fa-regular fa-copy"></i>
                                        Joining code: <strong>TizK52</strong>
                                        <span class="ques_small "><i class="fa-regular fa-circle-question"></i></span>
                                        <p class="hided">Joining code for actived student in this semester to join this team
                                        </p>
                                    </div>
                                    <div>
                                        <i class="fa  fa-building"></i>
                                        Department: <span class="tabProgram">Information System</span>
                                    </div>
                                    <div>
                                        <i class="fa-solid fa-unlock-keyhole"></i>
                                        <span class="tdTbl__success">Locked</span>
                                        <span class="ques_small locked">
                                            <i class="fa-regular fa-circle-question"></i>
                                        </span>
                                        <p class="hided">This team can send application to topics in this semester</p>

                                        <i class="fa-solid fa-user-shield"></i>
                                        <span class="tdTbl__success">public</span>
                                        <span class="ques_small public"><i class="fa-regular fa-circle-question"></i></span>
                                        <p class="hided">This team is visible to every actived student in this semester</p>

                                    </div>
                                </td>

                            </tr>
                            <tr>
                                <td>Description:</td>
                            </tr>
                        </tbody>
                    </table>
                    <table class="table teamTopic">
                        <tbody>
                            <tr>
                                <td>
                                    This team have not matched any topic yet
                                </td>
                            </tr>
                        </tbody>

                    </table>
                </div>

            </div>
        </section>
        <!-- topic -->

        <footer>
            <%@include file="footer.jsp" %>
        </footer>
        
        <% }
        %>
        
        <script src="./js/topic.js"></script>
    </body>

</html>
