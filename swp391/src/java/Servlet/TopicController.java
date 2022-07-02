/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.SemesterDAO;
import DAO.TopicDAO;
import DTO.Category;
import DTO.Semester;
import DTO.Topic;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SE161714 Ha Anh Tu
 */
@WebServlet(name = "TopicController", urlPatterns = {"/topic"})
public class TopicController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getAttribute("action").toString();
        HttpSession session = request.getSession();
        Semester currSem = null;
        TopicDAO td = new TopicDAO();

//        pagination
        String prevAction = (String) session.getAttribute("prevTopicAction");
        if (prevAction == null) {
            session.setAttribute("prevTopicAction", action);
            prevAction = action;
            ArrayList<Topic> appliableTopicList = checkValid(request, response);
            session.setAttribute("appliableTopicList", appliableTopicList);
        }
        session.setAttribute("currTopicAction", action);
        String currAction = (String) session.getAttribute("currTopicAction");
//        pagination
        switch (action) {
            case "index":
                currSem = (Semester) session.getAttribute("currentSem");
                ArrayList<Topic> list = td.readAll(currSem.getName());

                //        pagination
                if (!prevAction.equals(currAction)) {
                    session.setAttribute("totalPage", null);
                    session.setAttribute("page", null);
                }
                session.setAttribute("prevTopicAction", "index");
                pagination(request, response, list);
                //        pagination 

                request.getRequestDispatcher("/topic.jsp").forward(request, response);
                break;
            case "search":
                currSem = (Semester) session.getAttribute("currentSem");
                String searchText = request.getParameter("searchText");
                ArrayList<Topic> list2 = null;
                if (searchText == null) {
                    list2 = td.readAll(currSem.getName());
                } else {
                    list2 = td.searchByName(searchText, currSem.getName());
                }

                //        pagination
                if (!prevAction.equals(currAction)) {
                    session.setAttribute("totalPage", null);
                    session.setAttribute("page", null);
                }
                session.setAttribute("prevTopicAction", "search");
                pagination(request, response, list2);
                //        pagination

                request.setAttribute("searchText", searchText);
                request.getRequestDispatcher("/topic.jsp").forward(request, response);
                break;
            case "filter":
                currSem = (Semester) session.getAttribute("currentSem");
                String filter = request.getParameter("filter");

                //        pagination
                String prevFilter = (String) session.getAttribute("prevTopicFilter");
                if (prevFilter == null) {
                    session.setAttribute("prevTopicFilter", filter);
                    prevFilter = filter;
                }
                session.setAttribute("currTopicFilter", filter);
                String currFilter = (String) session.getAttribute("currTopicFilter");
                ArrayList<Topic> list3 = td.filterByDepartment(filter, currSem.getName());
                if (!prevAction.equals(currAction) || !prevFilter.equals(currFilter)) {
                    session.setAttribute("totalPage", null);
                    session.setAttribute("page", null);
                }
                switch (currFilter) {
                    case "Cong nghe thong tin":
                        session.setAttribute("prevTopicFilter", "Cong nghe thong tin");
                        break;
                    case "Quan tri kinh doanh":
                        session.setAttribute("prevTopicFilter", "Quan tri kinh doanh");
                        break;
                    case "Ngon ngu Anh":
                        session.setAttribute("prevTopicFilter", "Ngon ngu Anh");
                        break;
                    case "Ngon ngu Nhat":
                        session.setAttribute("prevTopicFilter", "Ngon ngu Nhat");
                        break;
                    case "Ngon ngu Han Quoc":
                        session.setAttribute("prevTopicFilter", "Ngon ngu Han Quoc");
                        break;
                }
                pagination(request, response, list3);
                request.setAttribute("filter", filter);
                session.setAttribute("prevTopicAction", "filter");
                session.setAttribute("currTopicAction", "pagefilter");
                //        pagination

                request.getRequestDispatcher("/topic.jsp").forward(request, response);
                break;
            case "pagefilter":
                filter = (String) session.getAttribute("prevTopicFilter");
                currSem = (Semester) session.getAttribute("currentSem");
                list3 = td.filterByDepartment(filter, currSem.getName());
                pagination(request, response, list3);
                session.setAttribute("prevTopicAction", "pagefilter");

                request.getRequestDispatcher("/topic.jsp").forward(request, response);
                break;
            case "detail":
                int id = Integer.parseInt(request.getParameter("id"));
                Topic topic = td.readById(id);
                Category cate = td.readCategoryByTopicId(id);
                request.setAttribute("topic", topic);
                request.setAttribute("cate", cate);
                request.getRequestDispatcher("/topicDetail.jsp").forward(request, response);
                break;
            case "semester":
                String semester = request.getParameter("semester");
                SemesterDAO sem = new SemesterDAO();
                Semester currentSem = sem.read(semester);
                session.setAttribute("currentSem", currentSem);
                ArrayList<Topic> list4 = td.readAll(currentSem.getName());

                ArrayList<Semester> semList = (ArrayList<Semester>) session.getAttribute("semList");

                //        pagination
                String prevSemName = (String) session.getAttribute("prevTopicSemester");
                if (prevSemName == null) {
                    session.setAttribute("prevTopicSemester", semester);
                    prevSemName = semester;
                }
                session.setAttribute("currTopicSemester", semester);
                String currSemName = (String) session.getAttribute("currTopicSemester");
                if (!prevAction.equals(currAction) || !prevSemName.equals(currSemName)) {
                    session.setAttribute("totalPage", null);
                    session.setAttribute("page", null);
                }
                for (int i = 0; i < semList.size(); i++) {
                    if (currSemName.equals(semList.get(i).name)) {
                        session.setAttribute("prevTopicSemester", semList.get(i).name);
                    }
                }
                session.setAttribute("prevTopicAction", "semester");
                session.setAttribute("currTopicAction", "pagesemester");

                pagination(request, response, list4);
                //        pagination

                request.getRequestDispatcher("/topic.jsp").forward(request, response);
                break;
            case "pagesemester":
                currSem = (Semester) session.getAttribute("currentSem");
                list4 = td.readAll(currSem.getName());
                pagination(request, response, list4);
                session.setAttribute("prevTopicAction", "pagesemester");

                request.getRequestDispatcher("/topic.jsp").forward(request, response);
                break;
            case "apply":
                currSem = (Semester) session.getAttribute("currentSem");
                int topicId = Integer.parseInt(request.getParameter("id"));
                int userId = (int) session.getAttribute("userId");
                int depId = (int) session.getAttribute("depId");
                int groupId = td.getGroupIdByUser(userId);
                td.updatePendingTopic(topicId);
                td.updatePendingTopicGroup(groupId);
                td.addPendingTable(groupId, topicId, depId);
                ArrayList<Topic> appliableTopicList2 = checkValid(request, response);
                session.setAttribute("appliableTopicList", appliableTopicList2);
                ArrayList<Topic> list5 = td.readAll(currSem.getName());

                if (!prevAction.equals(currAction)) {
                    session.setAttribute("totalPage", null);
                    session.setAttribute("page", null);
                }
                session.setAttribute("currTopicAction", "index");
                session.setAttribute("prevTopicAction", "index");

                pagination(request, response, list5);

                checkValid(request, response);
                request.getRequestDispatcher("/topic.jsp").forward(request, response);
                break;

        }
    }

    private void pagination(HttpServletRequest request, HttpServletResponse response, ArrayList<Topic> list) {
        int pageSize = 5;//Kich thuoc trang                        
        //Xac dinh so thu tu cua trang hien tai

        HttpSession session = request.getSession();
        session.setAttribute("totalPage", null);
        Integer page = (Integer) session.getAttribute("page");
        if (page == null) {
            page = 1;
        }

        //Xac dinh tong so trang
        Integer totalPage = (Integer) session.getAttribute("totalPage");
        if (totalPage == null) {
            int count = list.size();//Dem so luong records
            totalPage = (int) Math.ceil((double) count / pageSize);//Tinh tong so trang
        }

        String op = request.getParameter("op");
        if (op == null) {
            op = "FirstPage";
        }
        switch (op) {
            case "FirstPage":
                page = 1;
                break;
            case "PreviousPage":
                if (page > 1) {
                    page--;
                }
                break;
            case "NextPage":
                if (page < totalPage) {
                    page++;
                }
                break;
            case "LastPage":
                page = totalPage;
                break;
            case "GotoPage":
                page = Integer.parseInt(request.getParameter("gotoPage"));
                if (page <= 0) {
                    page = 1;
                } else if (page > totalPage) {
                    page = totalPage;
                }
                break;
        }

        //Lay trang du lieu duoc yeu cau
        List slist;
        int n1 = (page - 1) * pageSize;
        int n2 = n1 + pageSize - 1;
        try {
            slist = list.subList(n1, n2 + 1);
        } catch (Exception e) {
            slist = list.subList(n1, list.size());
        }//Doc mot trang

        //Luu thong tin vao session va request
        session.setAttribute("page", page);
        session.setAttribute("totalPage", totalPage);
        request.setAttribute("list", slist);
    }

    private ArrayList<Topic> checkValid(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        int userId = (int) session.getAttribute("userId");
        TopicDAO td = new TopicDAO();
        Semester currSem = (Semester) session.getAttribute("currentSem");

        int groupId = td.getGroupIdByUser(userId);
        int leaderStatus = td.checkLeader(userId);
        int depId = td.checkDepartment(userId);
        int semId = td.checkSemester(userId);
        int topicStatus = td.checkHaveTopic(userId);

        ArrayList<Topic> list = td.readAll(currSem.getName());
        ArrayList<Topic> appliableTopicList = new ArrayList();

        for (Topic item : list) {
            boolean check = td.checkHaveApplied(item.getTopicId(), groupId);
            if (leaderStatus == 1 && depId == item.getDepartmentId() && semId == item.getSemester().getSemesterId() && topicStatus != 2 && item.getStatus() != 2 && check == false) {
                appliableTopicList.add(item);
            }
        }

        return appliableTopicList;

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
