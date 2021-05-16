package library.service;

import java.sql.SQLException;

import library.dao.LoginDAO;



public class LoginService {

	public boolean loginCheck(String email, String password) throws Exception {
		boolean result=false;
		LoginDAO dao=new LoginDAO();
		try {
		 result=dao.loginCheck(email,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	}


