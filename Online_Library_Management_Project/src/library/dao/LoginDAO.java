package library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import library.config.MyConfiguration;



public class LoginDAO {

	public boolean loginCheck(String email, String password) throws Exception, SQLException {
		
		 boolean b=false;
			System.out.println("In Dao:" +email+" "+password);
			Connection con=MyConfiguration.getConnection();
			PreparedStatement pstmt=con.prepareStatement("select Email,Password from sturegister where Email=? AND Password=?");
			pstmt.setString(1, email);
			pstmt.setString(2, password);
	       ResultSet rs= pstmt.executeQuery();
			if(rs.next()){
				b= true;
			}
			else{
				b=false;
			}
	       return b;
	}

}
