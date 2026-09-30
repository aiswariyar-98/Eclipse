package Arraystring;

import java.util.Scanner;

public class Multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array declaration
		int ar[][]=new int[2][3];
		//array initialization
		ar[0][0]=1;
		ar[0][1]=2;
		ar[0][2]=3;
		ar[1][0]=4;
		ar[1][1]=5;
		ar[1][2]=6;
        for (int i=0;i<2;i++) {
        	for(int j=0;j<3;j++) {
        		System.out.print(ar[i][j]+" ");
        	}
        	System.out.println();
        }
        
        int arr[][]= {{10,20},{30,40},{50,60}};
        for (int i=0;i<3;i++) {
        	for (int j=0;j<2;j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
        
        System.out.println("Scanner"+"\n_____________________________");
        Scanner s1 = new Scanner(System.in);
        int a;
        System.out.println("enter the value of row:");
        a=s1.nextInt();
        int b;
        System.out.println("enter the value of column:");
        b=s1.nextInt();
        int ars[][]=new int[a][b];
        System.out.println("the array is ars["+a+"]["+b+"]");
        System.out.println("enter the elements");
        for (int i=0;i<a;i++) {
        	for (int j=0;j<b;j++) {
        		ars[i][j]=s1.nextInt();
        		}
        	}
        for (int i=0;i<a;i++) {
        	for (int j=0;j<b;j++) {
        		System.out.print(ars[i][j]+" ");
        		}
        	System.out.println();
        }
        
      
	}

}
