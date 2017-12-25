package nhan_nguyen_classes;

import java.sql.*;
public class Deletion  {

	public static PreparedStatement delete(Connection myConn) throws SQLException {
		
		@SuppressWarnings("unused")
		Cvar cvar = new Cvar();
		

		try { 
			
			
			//Call helper method to display the employee's information

			//System.out.println("BEFORE THE DELETE: " + "");
			//displayClass(myConn, "BIO 10", "Fall", 2014);

			//Delete the employee
			
			System.out.println("\nDELETING THE CLASS: " + Var.getClasses());
			
			
			
			
		
			String rowsAffected = ("delete from community_college " + "where year =? and term =? and class =?");
			
			PreparedStatement delete = myConn.prepareStatement(rowsAffected);
			
			delete.setInt(1, Var.getYear());
			delete.setString(2, Var.getTerm());
			delete.setString(3, Var.getClasses());
			
			
			
			delete.executeUpdate();
			
			//String sql = "delete from community_college " + "(year, term, class)" + " values(?,?,?)";
			
			//Cvar.setMyStmt(myConn.prepareStatement(sql));
			
			//Cvar.getMyStmt().setInt(1, getYear());
			//Cvar.getMyStmt().setString(2, getTerm());
			//Cvar.getMyStmt().setString(3, getClasses());
			
			//System.out.println("\nDELETING THE CLASS: " + "BIO 10");
			
			
			
			//execute sql query
			//Cvar.getMyStmt().executeUpdate();
			
			//System.out.println("AFTER THE DELETE...");
			//displayClass(myConn, "BIO 10", "Fall", 2014);

			//call helper method to display the employee's information
			//System.out.println("AFTER THE DELETE...");
			//displayClass(myConn, getClasses(), getTerm(), getYear());

		}

		catch(Exception exc) {
			exc.printStackTrace();
		}
		finally {
			close(myConn, Cvar.getMyStmt(), Cvar.getMyRs());
		}
		return Cvar.getMyStmt();
	}


	/*private static void displayClass (Connection myConn, String className, String term, int year) throws SQLException { 
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
			
		
		try { 
			
			//prepare statement 
			myStmt = myConn.prepareStatement("select year, term, class from community_college where year=? and term=? and class=?");
			
			
			myStmt.setInt(1, year);
			myStmt.setString(2, term);
			myStmt.setString(3, className);
			
			//Execute SQL query
			myRs = myStmt.executeQuery();
			
			//process result set
			boolean found = false;
			
			while (myRs.next()) {
				int theYear = myRs.getInt("year");
				String theTerm = myRs.getString("term");
				String theClass = myRs.getString("class");
			
				System.out.printf("Found class: %s %s, %s\n", theYear, theTerm, theClass);
				found=true;
			}
			
			if (!found) {
				System.out.println("class not NOT FOUND: " + className);				
			}
			
		}catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			close(myStmt, myRs);
		}
		

	}
	*/

	private static void close(Connection myConn, Statement myStmt,
			ResultSet myRs) throws SQLException {
		if (myRs != null) {
			myRs.close();
		}

		if (myStmt != null) {
			myStmt.close();
		}

		if (myConn != null) {
			myConn.close();
		}
	}
	private static void close(Statement myStmt, ResultSet myRs) throws SQLException {
		close(null, myStmt, myRs);
	}
	
}
	

