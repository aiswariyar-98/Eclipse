package Stringclass;

public class Stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using char creating array
		char exp[]= {'h','e','l','l','o'};
		System.out.println(exp); //in char alone it return correct value
		
		//to display sequentially
		for (int i=0;i<exp.length;i++) {
			System.out.println(exp[i]);
		}
		
		//creating array using string
		String names[]= {"Aaru","Ichu"};
		System.out.println(names); //gives invalid output
		
		for (int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		//string literals
		String n1= "Aishu";
		String n2= "Aishu";
		System.out.println(n1==n2); //true
		
		//new keyword
		String n3 = new String("Aishu");
		String n4 = new String("Aishu");
		System.out.println(n3==n4); //since different memory location
		
		//string method
		System.out.println(n2.equals(n4)); //it will check only length and case sensitive
		
		//string is immutable
		System.out.println(n1+" darling");
		//(or)
		n2=n2+" darling";
		System.out.println(n2);
		//only using+operator we addvalues
		n2.concat("Pretty");   //doesnt work
		System.out.println(n2);
		
		String newname=n2.concat(" Pretty"); //will work
		System.out.println(newname);
		
		//string buffer and string builder
		
		StringBuffer nam = new StringBuffer("mohandas");
		StringBuffer nam1 = new StringBuffer("karamchand");
		nam.append(" "+nam1); //for gap i have given space
		System.out.println(nam);
		nam.append(" gandhi");
		System.out.println(nam);

	}

}
