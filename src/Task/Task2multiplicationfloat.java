package Task;

import java.util.Scanner;

public class Task2multiplicationfloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,mul;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		a=ob.nextFloat();
		System.out.println("Enter the value of b :");
		b=ob.nextFloat();
		mul = a*b;
		System.out.println(a+"*"+b+"="+mul);

	}

}
