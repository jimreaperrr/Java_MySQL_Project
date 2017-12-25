import java.sql.*;
public class MetaDataBasicInfo {

	public static void main(String[] args) throws SQLException {
		Connection myConn = null; 
		
		try {
			//get connection
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","student","student");
			
			//get meta data
			DatabaseMetaData databaseMetaData = myConn.getMetaData();
			
			//Display info about database 
			
			System.out.println("Product name: " + databaseMetaData.getDatabaseProductName());
			System.out.println("Product version: " + databaseMetaData.getDatabaseProductVersion());
			System.out.println();
			
			//Display info about JDBC Driver
			System.out.println("JDBC Driver name: " + databaseMetaData.getDriverName());
			System.out.println("Driver version: " + databaseMetaData.getDriverVersion());
			
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			close(myConn);
		}

	}
	private static void close(Connection myConn) throws SQLException {
		if (myConn != null) {
			myConn.close();
		}
	}

}
