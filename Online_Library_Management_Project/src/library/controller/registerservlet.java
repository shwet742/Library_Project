package library.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import library.service.RegisterService;

/**
 * Servlet implementation class registerservlet
 */
@WebServlet("/register")
public class registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    System.out.println("Resistration Page");

	        int id=Integer.parseInt(request.getParameter("id"));
			System.out.println("ID:"+id);
		    String stuname=request.getParameter("stuname");
			System.out.println("StuName:"+stuname);
			String address=request.getParameter("address");
			System.out.println("Address:"+address);
			String contact=request.getParameter("contact");
			System.out.println("Contact:"+contact);
			String email=request.getParameter("email");
		    System.out.println("EmailId:"+email);
			String password=request.getParameter("password");
			System.out.println("Password:"+password);
			response.getWriter().append("Served at: ").append(request.getContextPath());
           RegisterService service=new RegisterService();
			try {
				 boolean result = service.registerCheck(id,stuname, address, contact, email, password);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	           boolean result = false;

		    if(result){
		    	System.out.println("Register Success...");
		    }
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
