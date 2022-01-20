package myregister.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myregister.bean.Employee;
import myregister.dao.EmployeeDao;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	private EmployeeDao employeeDao = new EmployeeDao();

	public EmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Get parameters from html attributes and set in string
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String contactNo = request.getParameter("contactNo");

		// Create object of Employee class and set string values in methods
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setUserName(userName);
		employee.setPassword(password);
		employee.setAddress(address);
		employee.setContactNo(contactNo);

		try {
			employeeDao.registerEmployee(employee); // Call EmployeeDao class method
		} catch (Exception e) {
			System.out.println(e);
		}

		//response.sendRedirect("register-form.jsp");
		RequestDispatcher dispatcher = request.getRequestDispatcher("register-form.jsp");
		dispatcher.forward(request, response);
	}

}
