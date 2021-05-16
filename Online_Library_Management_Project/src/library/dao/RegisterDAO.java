package library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import library.config.MyConfiguration;

public class RegisterDAO {

	public boolean registerCheck(int id,String stuname,String address,String contact,String email,String password) throws SQLException, ClassNotFoundException {
		boolean b=false;
		System.out.println("In DAO :"+email);
		Connection con=MyConfiguration.getConnection();
		PreparedStatement pstmt=con.prepareStatement("insert into sturegister values(?,?,?,?,?,?)");
		pstmt.setInt(1, id);
        pstmt.setString(2, stuname);
		pstmt.setString(3, address);
		pstmt.setString(4, contact);
		pstmt.setString(5, email);
		pstmt.setString(6, password);
       int rs= pstmt.executeUpdate();
       
       System.out.println(rs);
        System.out.println("Register successfully");
		return b;
	
		
		
	}
}


