package library.service;

import java.sql.SQLException;

import library.dao.AdminLoginDAO;

public class AdminLoginService {

	public boolean loginCheck(String email, String password) throws ClassNotFoundException, SQLException {
		boolean result=false;

		AdminLoginDAO dao=new AdminLoginDAO();
		result=dao.loginCheck(email,password);
		// TODO Auto-generated method stub
		return result;

	}


}
