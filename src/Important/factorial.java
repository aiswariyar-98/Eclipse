package Important;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = 1;
		int num;
		System.out.println("for which number you want the factorial :");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		for (int i =1;i<=num;i++) {
			factorial *= i;
		}
		System.out.println("factorial of "+num+"="+factorial);

	}

}
