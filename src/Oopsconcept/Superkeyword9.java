package Oopsconcept;
//applying super in variable
class Vehicle {
	int speed = 120;
}
class Car extends Vehicle {
	int speed = 140;
	public void display() {
		System.out.println(super.speed); //parent class speed
		System.out.println(speed); //sub class speed
	}
}

public class Superkeyword9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ob = new Car();
		ob.display();

	}

}
