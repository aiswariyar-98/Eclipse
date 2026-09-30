package operators;

import java.util.Scanner;

public class Work7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y;
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of x= ");
		x=s1.nextInt();
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("enter the value of y= ");
		y=s2.nextInt();
		
		boolean a,b;
		a = (x>y); //false
		b = (x!=y);//true
		
		//!(a||b)
		System.out.println("value of !(a||b) = "+!(a||b)); //false
		
		//!(a&&b)
		System.out.println("value of !(a&&b) = "+!(a&&b));  //true
		
		//!((a||b)&&(a||b))
		System.out.println("value of a||b ="+(a||b)+"\t"+"value of !((a||b)&&(a||b))= "+!((a||b)&&(a||b))); //true  false
		
		//!((a&&b)||(a&&b))
		System.out.println("value of a&&b = "+(a&&b)+"\t"+"value of !((a&&b)||(a&&b))="+!((a&&b)||(a&&b))); //false  true
        
		//ternary operator work
		//result=(number>0)?"positive number":"negative number"
		
		int number=5;
		
		String result=(number>0)? "positive number" : "negative number";
		System.out.println("value of result = "+result);
	}

}
