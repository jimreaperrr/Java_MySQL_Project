package testing;

import java.util.*;
public class Var {
	private static int year;
	private static String term;
	private static String classes;
	private static String description;
	private static int units;
	private static String grade;
	Scanner input = new Scanner(System.in);
	
	public Var () {
		
		year = getYear ();
		System.out.println(year);
		
	} 
	
	public void setYear () { 
		System.out.println("Enter the year of your semester: ");
		int year = input.nextInt();
	}
	public int getYear () {
		setYear();
		return year;
	}
	
	public String getTerm () {
		return term;
	}
	
	public String getClasses () {
		return classes;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getUnits () {
		return units;
	}
	
	public String grade () {
		return grade;
	}
}
