package library.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConfiguration {
	private static Connection con=null;
	public static Connection getConnection() throws ClassNotFoundException, SQLException  {
		
	
			Class.forName("com.mysql.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_prj", "root", "root");
		    return con;		
	}
}
