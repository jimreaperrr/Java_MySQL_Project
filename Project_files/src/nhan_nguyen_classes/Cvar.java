package nhan_nguyen_classes;
import java.util.*;

import java.sql.*;

//Connection Variables only 
public class Cvar extends Var {
	
	static Scanner input = new Scanner(System.in);
	private static Connection myConn = null;
	private  static PreparedStatement myStmt = null;
	private static ResultSet myRs = null;
	public static Object getMyStmt;
	
	public Cvar () {
		
	}
	
	
	public static Connection myConnInput () throws SQLException {
		String url2;
		String user2;
		String pw2;
		
		int attempts = 0;
		do {
			System.out.println("Enter the database url:");
			url2 = input.nextLine();

			System.out.println("Enter the username:");
			user2 = input.nextLine();

			System.out.println("Enter the password:");
			pw2 = input.nextLine();
			
			attempts++;
			
			
		}while (!url2.equals(getUrl()) && !user2.equals(getUser()) &&
					!pw2.equals(getPw()) && attempts < 3);

		setMyConn(DriverManager.getConnection(url2,user2,pw2));
		System.out.println("Connection Successful");

		return getMyConn();
}
	

	public static Connection getMyConn() {
		return myConn;
	}

	public static void setMyConn(Connection myConn) {
		Cvar.myConn = myConn;
	}

	public static PreparedStatement getMyStmt() {
		return myStmt;
	}

	public static void setMyStmt(PreparedStatement myStmt) {
		Cvar.myStmt = myStmt;
	}

	public static ResultSet getMyRs() {
		return myRs;
	}

	public static void setMyRs(ResultSet myRs) {
		Cvar.myRs = myRs;
	}
	

}
