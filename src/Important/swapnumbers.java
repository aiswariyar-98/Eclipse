package Important;

import java.util.Scanner;

public class swapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		Scanner s = new Scanner(System.in);
		System.out.println("enter value of a =");
		a=s.nextInt();
		System.out.println("enter value of b =");
		b=s.nextInt();
		System.out.println("value of a = "+a);
		System.out.println("value of b = "+b);
		a = a+b;
		b= a-b;
		a=a-b;
		System.out.println("current value of a ="+a);
		System.out.println("current value of b ="+b);

	}

}
