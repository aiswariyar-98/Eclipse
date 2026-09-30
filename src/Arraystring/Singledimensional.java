package Arraystring;

import java.util.Scanner;

public class Singledimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array declaration
		int arr[] = new int[6];
		//array initialization
		arr[0] =10;
		arr[1] =20;
		arr[2] =30;
		arr[3] =40;
		arr[4] =50;
		arr[5] =60;
		
		//to get array length
		System.out.println("length of the array="+(arr.length));
		//two string in object will give this invalid value
		System.out.println("invalid value");
		System.out.println(arr+"\n"+"--------------------------------");
		//random access
		System.out.println(arr[5]);
		//sequential output
		for (int i=0;i<(arr.length);i++) {
		System.out.println(arr[i]);	
		}
		System.out.println("---------------------------------------------"+"\narray declaration with initialization");
		//array declaration with initailization
		int array[]= {21,22,23,24,25};
		System.out.println(array[4]);
		for (int i=0;i<5;i++) {
			System.out.println(array[i]);
		}
		System.out.println("-----------------------------------------------"+"\nusing scanner single dimension array");
		int a;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the length of array=");
		a=s1.nextInt();
		int scannerar[] = new int[a];
		System.out.println("enter elements ");
		for (int i=0;i<a;i++) {
			scannerar[i]=s1.nextInt();
		}
		
		System.out.println("Elements are :");
		for (int i =0;i<a;i++) {
			System.out.println(scannerar[i]);
			//System.out.print(scannerar[i]+" ");
			
		}
		
	
		}			
}
