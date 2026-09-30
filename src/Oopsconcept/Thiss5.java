package Oopsconcept;

public class Thiss5 {
	String name;
	int age;
	//constructor
	public Thiss5(String Fullname,int presentage) { //using different variable name from instance variable so no need of this keyword
		// TODO Auto-generated constructor stub
		name = Fullname;
		age = presentage;
		System.out.println("constructor");
		System.out.println(Fullname);
		System.out.println(presentage);
	}
	
//this is another method to give value to instance variable	
	public void display() {
		
		name = "Priya";
		age = 18;
		System.out.println("Instance variable");
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiss5 ob = new Thiss5("Kannan",45);
		System.out.println("instance variable");
		System.out.println(ob.name+"\t"+ob.age);
		ob.display();
		

	}

}
