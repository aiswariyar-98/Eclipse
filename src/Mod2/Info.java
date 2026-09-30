package Mod2;

import Mod1.Details;

public class Info extends Details{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to access variale in another package class which is public either object or inheritance
//		Details ob = new Details();
//		System.out.println(ob.name);
//		System.out.println(ob.age);
		//since we have protected variable also in the class it can accessible only from subclass of another package
		Info ob = new Info();
		System.out.println(ob.name);
		System.out.println(ob.age);
		System.out.println(ob.address);
		//default is not accessible from another package
		//System.out.println(ob.country);--------it wont show
		//private is not accessible from another package
//		System.out.println(ob.mobnum);---------it wont comes
	}

}
