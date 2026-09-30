package Basics;

import java.util.Scanner;

public class Scannerpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in); //object creation
		String name; //variable declaration
		
		System.out.println("Name =" );
		name = s1.next();
		
		System.out.println("value of name = " + name);

	}

}
