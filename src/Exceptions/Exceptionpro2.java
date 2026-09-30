package Exceptions;

public class Exceptionpro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		try {
			System.out.println(a/0);
			int arr[]=null;
			System.out.println(arr[0]);
		}
		finally {
			for (int i =1;i<=10;i++) {
				System.out.println(i);
			}
		}

	}

}
