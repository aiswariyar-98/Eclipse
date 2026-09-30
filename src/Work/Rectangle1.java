package Work;

import java.util.Scanner;

public class Rectangle1 {
	//function with no return type and with parameters
	
	public void area(int l,int b) {
		int area = l*b;
		System.out.println("Area ="+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of length :");
		int l = s1.nextInt();
		System.out.println("Enter the value of breadth :");
		int b = s1.nextInt();
		Rectangle1 ob = new Rectangle1();
		ob.area(l,b);

	}

}
