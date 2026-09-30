package Exceptions;

public class Exceptionpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		try {
			System.out.println(arr[4]);
		}
		catch (Exception e) { //since we are not having exact name of exception we are giving 
			System.out.println(e);
		}
		for (int i =0;i<4;i++) {
			System.out.println(arr[i]);
		}

	}

}
