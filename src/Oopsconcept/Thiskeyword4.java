package Oopsconcept;

public class Thiskeyword4 {
	String name; //instance variable
	int age;
	
	//constructor using with keyword
	public Thiskeyword4(String name,int age) {  //same varible name and datatype of instance variable
		// TODO Auto-generated constructor stub
		this.name = name;  //using this keyword hence value pass to instance variable
		this.age = age;
		System.out.println("Constructor");
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeyword4 ob = new Thiskeyword4("Manu",28);
		System.out.println("Instance variable"+"\n"+ob.name+"\n"+ob.age);//make sure value is passed to instance variable

	}

}
