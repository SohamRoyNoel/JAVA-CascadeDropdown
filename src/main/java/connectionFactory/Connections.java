package connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {

	public static Connection getConnection() {
		
		Connection con = null;
		try {
			 //Registering the Driver
	    	Class.forName("com.mysql.jdbc.Driver");  
	        //Getting the connection
	        String mysqlUrl = "jdbc:mysql://localhost:3306/Worlds";
	        con = DriverManager.getConnection(mysqlUrl, "root", "root");
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
}
