package com.exercise39ajaxserver.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.exercise39ajaxserver.model.Employee;
import com.exercise39ajaxserver.model.PayRoll;
/**
 * Servlet implementation class CalculateSalaryServlet
 * @author Daniel Candia
 * @version 1.0
 */
@WebServlet("/CalculateSalaryServlet")
public class CalculateSalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='utf-8'");
		PrintWriter output = response.getWriter();
		Employee employee = new Employee();
		double calculateSalary = 0.0;
		
		employee.setNameEmployee(request.getParameter("txtName"));
		employee.setSalaryEmployee(Double.parseDouble(request.getParameter("txtSalary")));
		
		calculateSalary = PayRoll.CalculateSalary(employee);
		
		output.append("Calculate Salary with taxes is: "+calculateSalary);
		
		output.close();
	}

}
