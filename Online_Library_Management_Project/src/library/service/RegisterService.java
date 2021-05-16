package library.service;

import java.sql.SQLException;

import library.dao.RegisterDAO;

public class RegisterService {

	public boolean registerCheck(int id,String stuname,String address,String contact,String email,String password) throws ClassNotFoundException, SQLException {
        boolean result=false;
		RegisterDAO dao=new RegisterDAO();
		result=dao.registerCheck( id,stuname, address, contact, email, password);
		return result;
	}

}
