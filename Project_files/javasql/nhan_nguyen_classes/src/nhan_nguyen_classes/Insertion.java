package nhan_nguyen_classes;

import java.util.*;
import java.sql.*;

public class Insertion extends Var {
	
	public static PreparedStatement insert(Connection myConn) throws SQLException {
		
		Cvar cvar = new Cvar ();
		
		try {
						
			// Create a statement
						String sql = "insert into community_college " + "(year, term, class, description, units, grade)"
								+ " values (?,?,?,?,?,?)";
						Cvar.setMyStmt(myConn.prepareStatement(sql));

						// set parameters
						Cvar.getMyStmt().setInt(1, getYear());
						Cvar.getMyStmt().setString(2, getTerm());
						Cvar.getMyStmt().setString(3, getClasses());
						Cvar.getMyStmt().setString(4, getDescription());
						Cvar.getMyStmt().setInt(5, getUnits());
						Cvar.getMyStmt().setString(6, getGrade());

						// Inserting a new class for term : Fall 2014
						System.out.println("Inserting information... \n");

						// execute sql query

						Cvar.getMyStmt().executeUpdate();

						System.out.println("Insert complete.");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			close();
			
		}
		return Cvar.getMyStmt();
		
	}
	private static void close() throws SQLException {
		
		if (Cvar.getMyStmt() == null) {
			Cvar.getMyStmt().close();
		}
	
}
}
