package Oopsconcept;

abstract class Vehicle3 { //abstract class
	public abstract void starts(); //abstract method
	public void sound() {   //non abstract or concrete method
		System.out.println("beep....beep....");
	}
}
class Bus extends Vehicle3 {
	public void starts() {
		System.out.println("key starts");
	}
}

class Cycle extends Vehicle3 {
	public void starts() {
		System.out.println("pedalling");
	}
}

public class Abstractclass14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vehicle3 ob = new Vehicle3()------we cant create object for abstract class
		Vehicle3 ob = new Cycle();//upcasting
		ob.starts();
		ob.sound();
		
		//we can create object for subclass of abstract class
		
		Bus ob1 = new Bus();
		ob1.sound();
		ob1.starts();
	}

}
