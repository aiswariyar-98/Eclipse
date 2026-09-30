package controlstatements;

import java.util.Scanner;

public class multipication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i =1,j;
	Scanner s1=new Scanner(System.in);
	System.out.println("Which table u want:");
	j=s1.nextInt();
	
	while (i<=10) {
		System.out.println(j+"*"+i+"="+(j*i));
		i++;
	}
	//using for loop
	//for (i=1;i<=10;i++) {
	//System.out.println(i+"*"+j+"="+(i*j));
    //}
	//using do while
	//do {
		//System.out.println(i+"*"+j+"="+(i*j));
		//i++;
	//}
	//while (i<=10);
	}

}
