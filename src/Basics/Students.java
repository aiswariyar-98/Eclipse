package Basics;

public class Students {
	//instance variable
	String name ; //variable declaration
	
	//static variable
	static String course = "Testing"; //variable declaration with initialization

	public static void main(String[] args) {
		// TODO Auto-generated method stub             
		
		//local variable
		int age ; //variable declaration
		
		Students s1 = new Students();
		System.out.println("Name =" + (s1.name = "Aiswariya"));
		System.out.println("Age = " + (age = 27));
		System.out.println("Course = "+course);
		
		//need to create new object for seperate values
		Students s2 = new Students();
		System.out.println("Name =" + (s1.name = "Anusree"));
		System.out.println("Age = " + (age = 23));
		System.out.println("Course = "+course);
		
		Students s3 = new Students();
		System.out.println("Name =" + (s3.name = "Lamiya"));
		System.out.println("Age = " + (age = 24));
		System.out.println("Course = "+ (course="developer"));
		//we have replace course value as developer , static are changeable
		
		Students s4 = new Students();
		System.out.println("Name =" + (s4.name = "Ishanvi"));
		System.out.println("Age = " + (age = 23));
		System.out.println("Course = "+course);
		
		

	}

}
