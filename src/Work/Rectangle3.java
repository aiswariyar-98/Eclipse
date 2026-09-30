package Work;

import java.util.Scanner;

public class Rectangle3 {
	//function with return type and no parameters
	public int area() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of length :");
		int l = s1.nextInt();
		System.out.println("Enter the value of breadth :");
		int b = s1.nextInt();
		return l*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle3 ob = new Rectangle3();
		System.out.println("Area = "+ob.area());
	}

}
