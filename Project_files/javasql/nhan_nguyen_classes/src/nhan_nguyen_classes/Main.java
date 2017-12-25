package nhan_nguyen_classes;

import java.sql.*;
import java.util.*;
public class Main extends Cvar{
	

	public static void main(String[] args) throws SQLException  {
			
			Try_Connection.newConnection();
			
			Insertion.insert(getMyConn());
	
			Display_Results.displayRs(getMyConn(), getMyStmt());
			
	}
	
	private static void menu() { 
		System.out.print("Enter 1 for Insertion");
		int value = Integer.parseInt(input.nextLine());
		
		
		
	}
}
