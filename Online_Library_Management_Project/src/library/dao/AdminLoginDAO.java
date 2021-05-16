package library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import library.config.MyConfiguration;

public class AdminLoginDAO {

	public boolean loginCheck(String email, String password) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 boolean b=false;
			System.out.println("In Dao:" +email+" "+password);
			Connection con=MyConfiguration.getConnection();
			PreparedStatement pstmt=con.prepareStatement("select Email,Password from adminlogin where Email=? AND Password=?");
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
