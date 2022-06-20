package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class teamList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("        <title>Dashboard - Profile</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Google font -->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:700%7CMontserrat:400,600\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Font Awesome Icon -->\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/e7ea130b87.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom stlylesheet -->\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"./css/style.css\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- topic stylessheet -->\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"./css/topicTeamListStyle.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Header -->\r\n");
      out.write("        <header id=\"header\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <!-- Logo -->\r\n");
      out.write("                    <div class=\"navbar-brand\">\r\n");
      out.write("                        <a class=\"logo\" href=\"index.html\">\r\n");
      out.write("                            <img src=\"./img/logo.png\" alt=\"logo\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /Logo -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- Mobile toggle -->\r\n");
      out.write("                    <button class=\"navbar-toggle\">\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <!-- /Mobile toggle -->\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- Navigation -->\r\n");
      out.write("                <nav id=\"nav\">\r\n");
      out.write("                    <ul class=\"main-menu nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li><a class=\"align-nav\" href=\"./project.html\">Project</a></li>\r\n");
      out.write("                        <li><a class=\"align-nav\" href=\"./topic.html\"/>Topic</a></li>\r\n");
      out.write("                        <li><a class=\"align-nav\" href=\"./teamList.html\">Team List</a></li>\r\n");
      out.write("                        <li><a class=\"align-nav\" href=\"./contact.html\">Contact</a></li>\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                <img class=\"avatar\" src=\"./img/sample-avatar.jpg\" alt=\"Avatar\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"dropdown-menu\">\r\n");
      out.write("                                <br>\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"./profile.html\">\r\n");
      out.write("                                    <span style=\"margin-right: 4px;\" class=\"fa-solid fa-user fa-md\"></span>\r\n");
      out.write("                                    <span>Profile</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <hr>\r\n");
      out.write("                                <a class=\"'dropdown-item\" href=\"#\">\r\n");
      out.write("                                    <span style=\"margin-right: 3px;\" class=\"fa-solid fa-right-from-bracket fa-md\"></span>\r\n");
      out.write("                                    <span>Logout</span>\r\n");
      out.write("                                </a> \r\n");
      out.write("                                <br>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("                <!-- /Navigation -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- /Header -->\r\n");
      out.write("\r\n");
      out.write("        <!-- topic -->\r\n");
      out.write("        <section id=\"topic\" class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"teamListControl\">\r\n");
      out.write("                <div class=\"topic__title\">\r\n");
      out.write("                    <h1>Team List</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"btnControl\">\r\n");
      out.write("\r\n");
      out.write("                    <button class=\"team__btn\">+ Create A New Team</button>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"topic__container\">\r\n");
      out.write("\r\n");
      out.write("                <h6 class=\"topic__text\">\r\n");
      out.write("                    All of public and unlocked teams in semester SU2022_SWP\r\n");
      out.write("                </h6>\r\n");
      out.write("\r\n");
      out.write("                <hr>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"topic__search\">\r\n");
      out.write("                    <form action=\"\">\r\n");
      out.write("                        <input placeholder=\" \" class=\"search__input\" type=\"text\">\r\n");
      out.write("                        <label for=\"search\" class=\"search__label\">Search by team name</label>\r\n");
      out.write("                        <button type=\"submit\" class=\"search-btn \">\r\n");
      out.write("                            <img src=\"img/search-interface-symbol.png\" alt=\"\">\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"topic__filter\">\r\n");
      out.write("                        <i class=\"fa fa-regular fa-filter\"></i>Filters\r\n");
      out.write("                        <div class=\"dropdown1\">\r\n");
      out.write("                            <ul class=\"filter__list\">\r\n");
      out.write("                                <li class=\"filter__item\">Quan tri kinh doanh</li>\r\n");
      out.write("                                <li class=\"filter__item\">Cong nghe thong tin</li>\r\n");
      out.write("                                <li class=\"filter__item\">Ngon ngu Anh</li>\r\n");
      out.write("                                <li class=\"filter__item\">Ngon ngu Han Quoc</li>\r\n");
      out.write("                                <li class=\"filter__item\">Ngon ngu Nhat</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <table class=\"table topic__table\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>DEP.</th>\r\n");
      out.write("                            <th>TEAMNAME</th>\r\n");
      out.write("                            <th>LEADER</th>\r\n");
      out.write("                            <th>MEMBER(s)</th>\r\n");
      out.write("                            <th>STATUS</th>\r\n");
      out.write("                            <th>ACTION</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>IS</td>\r\n");
      out.write("                            <td>Polycell</td>\r\n");
      out.write("                            <td>[SE161502] Vũ Anh Thuyên</td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <span class=\"tdTbl__warning\"> 2/6</span>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <span class=\"tdTbl__warning\">Unlocked</span>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td><a href=\"teamDetail.html\"><i class=\"fa fa-solid fa-eye\"></i></a></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>SE</td>\r\n");
      out.write("                            <td>BeakyBlinders</td>\r\n");
      out.write("                            <td>[SE161497] Lê Hải Long</td>\r\n");
      out.write("                            <td><span class=\"tdTbl__success\"> 2/6</span></td>\r\n");
      out.write("                            <td><span class=\"tdTbl__warning\">Unlocked</span></td>\r\n");
      out.write("                            <td><a href=\"teamDetail.html\"><i class=\"fa fa-solid fa-eye\"></i></a></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>IS</td>\r\n");
      out.write("                            <td>Polycell</td>\r\n");
      out.write("                            <td>[SE161502] Vũ Anh Thuyên</td>\r\n");
      out.write("                            <td><span class=\"tdTbl__warning\"> 2/6</span></td>\r\n");
      out.write("                            <td><span class=\"tdTbl__warning\">Unlocked</span></td>\r\n");
      out.write("                            <td><a href=\"teamDetail.html\"><i class=\"fa fa-solid fa-eye\"></i></a></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>IS</td>\r\n");
      out.write("                            <td>Polycell</td>\r\n");
      out.write("                            <td>[SE161502] Vũ Anh Thuyên</td>\r\n");
      out.write("                            <td><span class=\"tdTbl__warning\"> 2/6</span></td>\r\n");
      out.write("                            <td><span class=\"tdTbl__warning\">Unlocked</span></td>\r\n");
      out.write("                            <td><a href=\"teamDetail.html\"><i class=\"fa fa-solid fa-eye\"></i></a></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>IS</td>\r\n");
      out.write("                            <td>Polycell</td>\r\n");
      out.write("                            <td>[SE161502] Vũ Anh Thuyên</td>\r\n");
      out.write("                            <td><span class=\"tdTbl__warning\"> 2/6</span></td>\r\n");
      out.write("                            <td><span class=\"tdTbl__warning\">Unlocked</span></td>\r\n");
      out.write("                            <td><a href=\"teamDetail.html\"><i class=\"fa fa-solid fa-eye\"></i></a></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("                <hr>\r\n");
      out.write("\r\n");
      out.write("                <nav aria-label=\"pagination Page navigation example\">\r\n");
      out.write("                    <ul class=\"pagination justify-content-center\">\r\n");
      out.write("                        <li class=\"page-item disabled\">\r\n");
      out.write("                            <a class=\"page-link\" href=\"#\" tabindex=\"-1\">Previous</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"#\">1</a></li>\r\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\r\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\r\n");
      out.write("                        <li class=\"page-item\">\r\n");
      out.write("                            <a class=\"page-link\" href=\"#\">Next</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- topic -->\r\n");
      out.write("\r\n");
      out.write("        <footer id=\"footer\" class=\"section\">\r\n");
      out.write("\r\n");
      out.write("            <!-- container -->\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                <!-- row -->\r\n");
      out.write("                <div id=\"bottom-footer\" class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- social -->\r\n");
      out.write("                    <div class=\"col-md-4 col-md-push-8\">\r\n");
      out.write("                        <ul class=\"footer-social\">\r\n");
      out.write("                            <li><a href=\"#\" class=\"facebook\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("                            <li><a href=\"#\" class=\"twitter\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("                            <li><a href=\"#\" class=\"google-plus\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("                            <li><a href=\"#\" class=\"instagram\"><i class=\"fa fa-instagram\"></i></a></li>\r\n");
      out.write("                            <li><a href=\"#\" class=\"youtube\"><i class=\"fa fa-youtube\"></i></a></li>\r\n");
      out.write("                            <li><a href=\"#\" class=\"linkedin\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /social -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- copyright -->\r\n");
      out.write("                    <div class=\"col-md-8 col-md-pull-4\">\r\n");
      out.write("                        <div class=\"footer-copyright\">\r\n");
      out.write("                            <span>&copy; Copyright 2022. All Rights Reserved. | FPT University </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /copyright -->\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- row -->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /container -->\r\n");
      out.write("\r\n");
      out.write("        </footer>\r\n");
      out.write("        <script src=\"./js/topic.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}