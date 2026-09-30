package Oopsconcept;
class Vehicle2 {
	public Vehicle2(int speed) {
		// TODO Auto-generated constructor stub
		//System.out.println(120); //if default
		System.out.println("speed = "+speed);
	}
}
class Car2 extends Vehicle2 {
	public Car2() {
		// TODO Auto-generated constructor stub
		super(120);//sice parent constructor have parameters
		System.out.println(140);
	}
}

public class Super11 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 ob = new Car2(); //if both constructor are default both value will print

	}

}
