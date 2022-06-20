/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.StudentGroupDAO;
import DTO.StudentGroup;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SE161740 Pham Nguyen Hung Anh
 */
@WebServlet(name = "GroupController", urlPatterns = {"/group"})
public class GroupController extends HttpServlet {

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
        StudentGroupDAO sg = new StudentGroupDAO();

        switch (action) {
            case "index":                              
                ArrayList<StudentGroup> list = sg.readAll();
                request.setAttribute("list",list );
                request.getRequestDispatcher("/teamList.jsp").forward(request, response);
                break;
            case "search":
                String searchText = request.getParameter("searchText");
                if(searchText==null){
                    response.sendRedirect("/teamList.jsp");
                }
                ArrayList<StudentGroup> list2= sg.searchGroupByName(searchText);
                request.setAttribute("list", list2);
                request.setAttribute("searchText", searchText);
                request.getRequestDispatcher("/teamList.jsp").forward(request, response);
                break;
            case "filter":
                 String filter=request.getParameter("filter");
                 ArrayList<StudentGroup> list3= sg.filterByDepartment(filter);
                 request.setAttribute("list", list3);
                 request.getRequestDispatcher("/teamList.jsp").forward(request, response);
                 break;

        }
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