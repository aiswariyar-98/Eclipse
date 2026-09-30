package Mod1;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to access the variable in another class either object or inheritance
		Details ob = new Details();
		System.out.println(ob.name);
		System.out.println(ob.age);
		//protected within class accessible
		System.out.println(ob.address);
		//default is accessible within package
		System.out.println(ob.country);
		//private is not accessible from another class
//		System.out.println(ob.mobnum);---------it wont comes
	}

}
