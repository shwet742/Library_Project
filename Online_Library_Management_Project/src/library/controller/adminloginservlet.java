package library.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import library.service.AdminLoginService;

/**
 * Servlet implementation class adminloginservlet
 */
@WebServlet("/adminlogin")
public class adminloginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminloginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Admin_Login_Page");
		   String email=request.getParameter("email");
			System.out.println("Email:"+email);
			String password=request.getParameter("password");
			System.out.println("Password:"+password);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	    AdminLoginService service= new AdminLoginService();
	    boolean result;
	    try {
			result= service.loginCheck(email,password);
			if(result){
				System.out.println("Login success...");
				request.setAttribute("msg", "WELCOME TO ONLINE LIBRARY  MANAGEMENT SYSTEM");
				
		         RequestDispatcher rd=request.getRequestDispatcher("adminhomepage.jsp");
				rd.forward(request, response);
			
			}else{
				System.out.println("Login fail....");
				request.setAttribute("msg", "Your Email and Password is incorrect..!!");
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
