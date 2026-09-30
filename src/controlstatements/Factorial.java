package controlstatements;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int k=1;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the number :");
		num =s1.nextInt();
	
		
		for (int i=1;i<=num;i++) {
			k*=i;
		}
		
		System.out.println("Factorial of "+num+" = "+k);
	}

}
