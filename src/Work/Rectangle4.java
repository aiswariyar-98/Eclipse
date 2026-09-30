package Work;

import java.util.Scanner;

public class Rectangle4 {
	//function with return type and with parameters
	public int area(int l,int b) {
		return l*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of length :");
		int l = s1.nextInt();
		System.out.println("Enter the value of breadth :");
		int b = s1.nextInt();
		Rectangle4 ob = new Rectangle4();
		int a=ob.area(l, b);
		System.out.println("Area of a rectangele = "+a);

	}

}
