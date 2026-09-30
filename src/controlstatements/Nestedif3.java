package controlstatements;

public class Nestedif3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=15;
		if (num1%2==0) {
			if (num1>0) {
				System.out.println("It is a positive even number");
			}
			else {
				System.out.println("It is a negative even number");
			}
		}
		else {
			if (num1<0) {
				System.out.println("It is a negative odd number ");
			}
			else {
				System.out.println("It is a positive odd number");
			}
		}

	}

}
