package nhan_nguyen_classes;

import java.util.*;
import java.sql.*;
public class Display_Results extends Cvar {
	
	public static void displayRs (Connection myConn, PreparedStatement myStmt) throws SQLException {
		
		try {
		setMyRs(myStmt.executeQuery("select * from community_college order by year"));
		
		while (getMyRs().next()) {
			System.out.println(getMyRs().getString("year")
							   +"\t Term: " + getMyRs().getString("term") 
							   + "\t Class:" + getMyRs().getString("class")   
							   + "\t Description: " + getMyRs().getString("description") 
							   + "\t Units: " + getMyRs().getString("units")
							   + "\t Grade: " + getMyRs().getString("grade"));  
			} 
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			close(myConn, getMyRs());
		}
		
		
	}
	private static void close(Connection myConn, ResultSet myRs) throws SQLException {
		
		if (myRs != null) {
			getMyStmt().close();
		}
		
		if (myConn != null) {
			myConn.close();
		}
		
		
	

}
}
