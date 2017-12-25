package testing;


import java.util.*;
public class Main {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the year of your semester: ");
		int year = input.nextInt();
		System.out.println();
		
		System.out.print("Enter the term of your semester: ");
		String term = input.next();
		System.out.println();
		
		System.out.print("Enter your class name: ");
		String classes = input.next();
		System.out.println();

		System.out.print("Enter the description for your class: ");
		String description = input.next();
		System.out.println();
		
		System.out.print("Enter the units for your class: ");
		int units = input.nextInt();
		System.out.println();

		System.out.print("Enter the grade for your class: ");
		String grade = input.next();
		

	}
}
