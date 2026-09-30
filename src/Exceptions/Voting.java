package Exceptions;

import java.util.Scanner;

public class Voting{

	public static void main(String[] args) throws AgeLimitException { //throws given in method header
		// TODO Auto-generated method stub
		System.out.println("enter your age : ");
		Scanner sc =new Scanner(System.in);
		int age = sc.nextInt();
		
		try {
		if (age<18) {
			throw new AgeLimitException ("below 18 not eligible"); //inside function we give throw
			//System.out.println("below 18 not eligible");
			}
			
		else {
			System.out.println("eligible to vote");
		 }
		}
		catch (AgeLimitException e) {
			System.out.println(e);
		}
		System.out.println("hai");

	}

}
