package Methodandconstructor;

import java.util.Scanner;

public class Method2 {
	
	//method2 function with no return type and with parameter
	
	public void add (int a,int b) {
		int sum = a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method2 ob = new Method2();
		Scanner s1 = new Scanner(System.in);
		System.out.println("ennter the value of a: ");
		int a = s1.nextInt();
		System.out.println("ennter the value of b: ");
		int b = s1.nextInt();
		ob.add(a, b);
	}

}
