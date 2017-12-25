package nhan_nguyen_classes;

import java.sql.*;
public class Main extends Cvar{
	

	public static void main(String[] args) throws SQLException  {
			
			Try_Connection.newConnection();
			
			//     jdbc:mysql://localhost:3306/classes
			menu();
			
	
			//Display_Results.displayRs(getMyConn(), getMyStmt());
			
	}
	
	private static void menu() throws SQLException { 
		System.out.print("Enter 1 for Insertion, 2 for Deletion, 3 for viewing only");
		int value;
		value = Integer.parseInt(input.nextLine());
		
		switch (value) 
				 {
		case 1:
			
			Insertion.insert(getMyConn());
			break;
			
		case 2:
			@SuppressWarnings("unused") 
			Var var2 = new Var (value);
			Deletion.delete(getMyConn());
			break;
		case 3:
			Display_Results.displayRs(getMyConn(), getMyStmt());
			break;
				 
		default:
			System.out.print("Enter 1 for Insertion, 2 for Deletion, 3 for viewing only");
			value = Integer.parseInt(input.nextLine());
			
		
				 }
		
	}
}
