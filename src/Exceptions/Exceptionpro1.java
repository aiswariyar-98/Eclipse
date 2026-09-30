package Exceptions;

public class Exceptionpro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		try {
			System.out.println(a/0);
			int arr[]=null;
			System.out.println(arr[0]);
		}
		catch (ArithmeticException e1) {
			System.out.println(e1);
		}
		catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2);
		}
		catch (Exception e) {
			System.out.println(e);   //we can give many catch but first we need to give the exception we know then last we need to give exception e
		}
		for (int i =1;i<=10;i++) {
			System.out.println(i);
		}

	}

}
