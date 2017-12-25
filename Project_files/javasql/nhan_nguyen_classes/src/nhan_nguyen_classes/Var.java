package nhan_nguyen_classes;

import java.util.*;


public class Var{
	
	static Scanner input = new Scanner(System.in);
	
	
	private static int year;
	private static String term;
	private static String classes;
	private static String description;
	private static int units;
	private static String grade;
	
	//database connection information 
	private static String url = "jdbc:mysql://localhost:3306/classes";
	private static String user = "jimmynhannguyen";
	private static String pw = "Nhan1414C";
	
	public Var () {
		setYear();
		setTerm();
		setClasses();
		setDescription();
		setUnits();
		setGrades();
		
	
	} 
	public static void setYear() {
		System.out.println("Enter the year of your semester: ");
		year = Integer.parseInt(input.nextLine()); 	
	}
	
	public static int getYear () {
		return year;
	}
	
	public static void setTerm() {
		System.out.println("Enter the term of your semester:\n");
		term = input.nextLine();
	}
	
	public static String getTerm () {
		return term;
	}
	
	public static void setClasses() {
		System.out.println("Enter your class name:\n");
		classes = input.nextLine();
	}
	
	public static String getClasses () {
		return classes;
	}
	
	public static void setDescription () {
		System.out.println("Enter the description for your class:\n");
		description = input.nextLine();
		
	}
	public static String getDescription() {
		return description;
	}
	
	public static void setUnits () {
		System.out.println("Enter the units for your class:\n");
		units = Integer.parseInt(input.nextLine());
	}
	
	public static int getUnits () {
		return units;
	}
	
	public static void setGrades() {
		System.out.println("Enter the (capitalized) grade for your class:\n");
		grade = input.nextLine(); 
		
	}
	
	public static String getGrade () {
		return grade;
	}
	
	public static String getUrl() {
		return url;
	}
	
	public static String getUser() {
		return user;
	}
	
	public static String getPw() {
		return pw;
	}
	

	
	
}


