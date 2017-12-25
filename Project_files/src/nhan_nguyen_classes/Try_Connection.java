package nhan_nguyen_classes;

import java.sql.*;


public class Try_Connection extends Cvar {

	

	public static Connection newConnection () throws SQLException{ 
		
		try {
		
			myConnInput(); 
			
		}
	
		catch (Exception exc) {
			exc.printStackTrace();
		    }
		
	
	return Cvar.getMyConn();
	}
}
