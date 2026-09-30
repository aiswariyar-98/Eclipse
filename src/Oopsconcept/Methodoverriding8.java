package Oopsconcept;

//parent class
class Birds {
	public void sound() {  //same functionname
		System.out.println("tweet......tweet.....");
	}
}
//child class
class Crow extends Birds {
	public void sound() {    //same functionname
		System.out.println("Ka..Ka..Ka");
	}
}

public class Methodoverriding8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Crow ob = new Crow();   //if same function name is given in different class the compiler will take priority to which class we create object and super class will be override by sub class
		ob.sound();
		
		Birds ob1 = new Crow(); //dynamic binding
		ob1.sound();
	

	}

}
