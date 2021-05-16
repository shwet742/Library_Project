package library.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import library.service.LoginService;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/stulogin")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	System.out.println("Login_Page");
	   String email=request.getParameter("email");
		System.out.println("Email:"+email);
		String password=request.getParameter("password");
		System.out.println("Password:"+password);
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	    LoginService service=new LoginService();
	    boolean result;
		try {
			  result = service.loginCheck(email,password);
			  if(result){
		System.out.println("Login success...");
		request.setAttribute("msg", "WELCOME TO ONLINE LIBRARY  MANAGEMENT SYSTEM");
		
         RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
	}else{
		System.out.println("Login fail....");
		request.setAttribute("msg", "Your Email and Password is incorrect..!!");
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}
		}catch (Exception e) {
			// TODO: handle exception
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
