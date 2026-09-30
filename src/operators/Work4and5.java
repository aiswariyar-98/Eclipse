package operators;

import java.util.Scanner;

public class Work4and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of x = ");
		x = s1.nextInt();
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("enter the value of y = ");
		y = s2.nextInt();
		
		Scanner s3 = new Scanner(System.in);
		System.out.println("enter the value of z = ");
		z = s3.nextInt();
		
		System.out.println("Work4 = "+ (x+z/x+(z%y)*(z-x)));
		
		System.out.println("Work5 = "+ (z/x+y*x-(y+x)%z));

	}

}
