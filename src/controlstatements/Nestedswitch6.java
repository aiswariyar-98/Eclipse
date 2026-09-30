package controlstatements;

import java.util.Scanner;

public class Nestedswitch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Available options");
		System.out.println("_______________________");
		System.out.println("1. PG");
		System.out.println("a.MCA \t  b.MBA  \t  c.MSc");
		System.out.println("2. UG");
		System.out.println("a.BCA \t  b.BBA  \t  c.BSc");
		int qualification;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your qualification:");
		qualification = s1.nextInt();
		System.out.println("Qualification = "+qualification);
		String course ;
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter your course:");
		course = s2.next();
		System.out.println("Course = "+course);
		switch (qualification) {
		case 1 : System.out.println("1.PG");
		switch (course) {
		case "a" : System.out.println("MCA");
		break;
		case "b" : System.out.println("MBA");
		break;
		case "c" : System.out.println("MSC");
		break;
		default : System.out.println("Invalid");
		}
		break;
		case 2 : System.out.println("2.UG");
		switch (course) {
		case "a" : System.out.println("BCA");
		break;
		case "b" : System.out.println("BBA");
		break;
		case "c" : System.out.println("BSC");
		break;
		default : System.out.println("Invalid");
		}
		break;
		default : System.out.println("Invalid input");
		}

	}

}
