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
import za.ac.tut.models.Employee;

/**
 *
 * @author Sifiso
 */
public class EmployeeDetailsServlet extends HttpServlet {
@EJB EmployeeFacadeLocal eml;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Double tempValue = Double.parseDouble(request.getParameter("temp_value"));
       Long id = Long.parseLong(request.getParameter("id"));
       String name = request.getParameter("name");
        System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        Employee emp = new Employee();
        emp.setId(id);
        emp.setName(name);
        emp.setTempReading(tempValue);
        eml.create(emp);
        
        request.getRequestDispatcher("capture_employee_details_outcome.jsp").forward(request, response);
        
    }

}
