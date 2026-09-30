package operators;

import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num , c;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of num = ");
		num = s1.nextFloat();
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("enter the value of c = ");
		c = s2.nextFloat();
		
		System.out.println("Mod = "+ (num % c));
		

	}

}
