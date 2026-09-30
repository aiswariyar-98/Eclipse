package Work;

import java.util.Scanner;

public class Rectangle {
	
	//function with no return type and no parameters
	public void area() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of length :");
		int a = s1.nextInt();
		System.out.println("Enter the value of breadth :");
		int b = s1.nextInt();
		int area = a*b;
		System.out.println("Area = "+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle ob = new Rectangle();
		ob.area();

	}

}
