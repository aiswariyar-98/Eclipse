package Work;

import java.util.Scanner;

public class Elseifladderwork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of a=");
		a=s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the value of b=");
		b=s2.nextInt();
		Scanner s3 = new Scanner(System.in);
		System.out.println("Enter the value of c=");
		c=s3.nextInt();
		if ((a<b)&&(a<c)) {
			System.out.println("Smallest number is a ="+a);
		}
		else if ((b<a)&&(b<c)) {
			System.out.println("Smallest number is b ="+b);
		}
		else {
			System.out.println("Smallest number is c ="+c);
		}

	}

}
