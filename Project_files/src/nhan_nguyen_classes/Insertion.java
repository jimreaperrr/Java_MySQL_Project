package nhan_nguyen_classes;

import java.sql.*;

public class Insertion {
	
	public static PreparedStatement insert(Connection myConn) throws SQLException {
		@SuppressWarnings("unused")
		Cvar cvar = new Cvar();
		try {
						
			// Create a statement
						String sql = "insert into community_college " + "(year, term, class, description, units, grade)"
								+ " values (?,?,?,?,?,?)";
						Cvar.setMyStmt(myConn.prepareStatement(sql));

						// set parameters
						Cvar.getMyStmt().setInt(1, Var.getYear());
						Cvar.getMyStmt().setString(2, Var.getTerm());
						Cvar.getMyStmt().setString(3, Var.getClasses());
						Cvar.getMyStmt().setString(4, Var.getDescription());
						Cvar.getMyStmt().setInt(5, Var.getUnits());
						Cvar.getMyStmt().setString(6, Var.getGrade());

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
