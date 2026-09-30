package Methodandconstructor;

import java.util.Scanner;

public class Method3 {
	//method3 function with return type and no parameters
	public int add() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter value of a :");
		int a = s1.nextInt();
		System.out.println("enter value of b :");
		int b = s1.nextInt();
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method3 ob = new Method3();
		System.out.println(ob.add());
		//or
		int sum = ob.add();
		System.out.println("sum="+sum);

	}

}
