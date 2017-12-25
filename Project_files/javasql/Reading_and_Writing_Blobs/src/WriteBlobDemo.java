import java.io.*;
import java.sql.*;
public class WriteBlobDemo {

	public static void main(String[] args) throws SQLException, IOException {
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		FileInputStream input = null;
		
		try {
			//get connection
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "student", "student");
			
			//prepare statement 
			String sql = "update employees set resume=? where email= 'john.doe@foo.com'";
			myStmt = myConn.prepareStatement(sql);
			
			//set parameter for resume file name
			File theFile = new File("sample_resume.pdf");
			input = new FileInputStream(theFile);
			myStmt.setBinaryStream(1, input);
			
			//Execute statement
			System.out.println("\nStoring resume in database: " + theFile);
			System.out.println(sql);
			
			myStmt.executeUpdate();
			
			System.out.println("\nCompleted successfully!");
			
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {			
			if (input != null) {
				input.close();
			}
			
			close(myConn, myStmt);			
		}
	}

	private static void close(Connection myConn, Statement myStmt)
			throws SQLException {

		if (myStmt != null) {
			myStmt.close();
		}
		
		if (myConn != null) {
			myConn.close();
		}
	}

}
