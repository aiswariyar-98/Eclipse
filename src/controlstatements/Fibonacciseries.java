package controlstatements;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value =");
		a=s1.nextInt();
		System.out.println("Fibonacci series of "+a+":");
		int a1=0;
		int a2=1;
		for (int i=1;i<=a;i++) {
			System.out.println(a1+" ");
			int a3=a1+a2;
			a1=a2;
			a2=a3;
			}
		}
	}


