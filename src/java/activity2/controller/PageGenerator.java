package activity2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PageGenerator", urlPatterns = {"/pager"})
public class PageGenerator extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Attendance</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Distributed Java Attendance </h1>");
            out.println("<p>Date: 08/31/2017 </p>");
            out.println("<br>");
            
           out.println("<table id='attendanceTable' name = 'attendanceTable'>");
                out.println("<tr>");
                    out.println("<th> Student Id </th>");
                    out.println("<th> Student Name </th>");
                    out.println("<th> Attended Class </th>");
                out.println("</tr>");
                out.println("<tr>");
                    out.println("<td> 1 </td>");
                    out.println("<td> John Smith </td>");
                    out.println("<td> True </td>");
                out.println("</tr>");
                out.println("<tr>");
                    out.println("<td> 2 </td>");
                    out.println("<td> Jane Doe </td>");
                    out.println("<td> False </td>");
                out.println("</tr>");
                out.println("<tr>");
                    out.println("<td> 3 </td>");
                    out.println("<td> Collin Scherbert </td>");
                    out.println("<td> True </td>");
                out.println("</tr>");
           out.println("</table>");
            
            
            out.println("</body>");
            out.println("</html>");
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
