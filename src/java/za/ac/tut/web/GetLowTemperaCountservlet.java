/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.EmployeeFacadeLocal;

/**
 *
 * @author Sifiso
 */
public class GetLowTemperaCountservlet extends HttpServlet {
    @EJB EmployeeFacadeLocal eml;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long lowcnt =eml.determineNumberOfLowTemperatureEmployees();
        request.setAttribute("lowcnt",lowcnt);
        
        request.getRequestDispatcher("low_temp_cnt_outcome.jsp").forward(request, response);
    }


}
