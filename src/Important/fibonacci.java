package Important;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =0;
		int b=1;
		int c;
		int num;
		System.out.println("enter the number of which you want fibonacci series :");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		System.out.println("Fibonacci series of "+num+ "are :");
		System.out.println("______________________________________________");
		System.out.print(a+" "+b);
		for (int i =0;i<num-2;i++) {
			c = a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}

}
