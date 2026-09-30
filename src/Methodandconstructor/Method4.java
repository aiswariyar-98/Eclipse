package Methodandconstructor;

import java.util.Scanner;

public class Method4 {
	//method4 function with return type and with parameters
	public int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method4 ob = new Method4();
		Scanner s1= new Scanner(System.in);
		System.out.println("enter value of a :");
		int a = s1.nextInt();
		System.out.println("enter value of b :");
		int b = s1.nextInt();
		System.out.println(ob.add(a, b));
		//or
		int c=ob.add(a, b);
		System.out.println(c);

	}

}
