package Methodandconstructor;

import java.util.Scanner;

public class Method1 {
	
	//method1 function with no return type and no parameter
	
	public void add() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of a : ");
		int a = s1.nextInt();
		System.out.println("enter the value of b : ");
		int b = s1.nextInt();
		int sum = a + b;
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Method1 ob = new Method1();
		ob.add();

	}

}
