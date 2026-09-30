package Oopsconcept;

public class Withoutthis6 {
	String name; //instance variable
	int age;
	//constructor
	public Withoutthis6(String name,int age) {  //same variable name of instance is used as constructor parameters
		// TODO Auto-generated constructor stub
		name = name; //without this values will not get pass to instance variable it stores only in constructor
		age = age;
		System.out.println("Constructor");
		System.out.println(name);
		System.out.println(age);
	}
	
	public void display() {
		System.out.println("Instance values");
		System.out.println(name); //calling instance variable
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Withoutthis6 ob = new Withoutthis6("kavya",30);
		ob.display();

	}

}
