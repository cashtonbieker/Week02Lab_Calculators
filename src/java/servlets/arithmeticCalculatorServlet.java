/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cashton
 */
public class arithmeticCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

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
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                        .forward(request, response);
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
        String strFirst = request.getParameter("first");
        String strSecond = request.getParameter("second");
        
        
        
        int first;
        int second;
        int result = 0;
        
        try {
            first = Integer.parseInt(strFirst);
            second = Integer.parseInt(strSecond);
            
            if (request.getParameter("add") != null){
                result = first + second;
            }
            else if (request.getParameter("subtract") != null){
                result = first - second;
            }
            else if (request.getParameter("multiply") != null){
                result = first * second;
            }
            else if (request.getParameter("divide") != null){
                result = first / second;
            }
            request.setAttribute("result", result);
            request.setAttribute("first", strFirst);
            request.setAttribute("second", strSecond);
        }
        catch (NumberFormatException e){
            request.setAttribute("result", "Invalid.");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                        .forward(request, response);
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
