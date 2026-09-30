package operators;

import java.util.Scanner;

public class StudentworkScanner4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,dob,address,quali,institution,course;
		String gender,grade;
		byte age = 28;
		long mobnum;
		float totalm;
		int fees;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter your name = ");
		name = s1.nextLine();
		System.out.println("Name          : "+name);
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("enter your gender = ");
		gender = s2.next();
		System.out.println("Gender        : "+gender);
		
		Scanner s3 = new Scanner(System.in);
		System.out.println("enter your dob = ");
		dob = s3.next();
		System.out.println("DOB           : "+dob);
		
		Scanner s4 = new Scanner(System.in);
		System.out.println("enter your address = ");
		address = s4.next();
		System.out.println("Address       : "+address);
		
		Scanner s5 = new Scanner(System.in);
		System.out.println("enter your mobile number = ");
		mobnum = s5.nextLong();
		System.out.println("MOBILE        : "+mobnum);
		
		Scanner s6 = new Scanner(System.in);
		System.out.println("enter your qualification = ");
		quali = s6.next();
		System.out.println("Qualification : "+quali);
		
		Scanner s7 = new Scanner(System.in);
		System.out.println("enter your marks = ");
		totalm = s7.nextFloat();
		System.out.println("Totalmarks    : "+totalm);
		
		Scanner s8 = new Scanner(System.in);
		System.out.println("enter your grade = ");
		grade = s8.next();
		System.out.println("Grade         : "+grade);
		
		Scanner s9 = new Scanner(System.in);
		System.out.println("enter your institution = ");
		institution = s9.nextLine();
		System.out.println("Institution   : "+institution);
		
		Scanner s10 = new Scanner(System.in);
		System.out.println("enter your course = ");
		course = s10.nextLine();
		System.out.println("Course        : "+course);
		
		Scanner s11 = new Scanner(System.in);
		System.out.println("enter your fees = ");
		fees = s11.nextInt();
		System.out.println("Fees          : "+fees);

	}

}
