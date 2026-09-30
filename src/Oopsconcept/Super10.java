package Oopsconcept;
class Vehicle1 {
	public void speed() {
		System.out.println(120);
	}
}
class Car1 extends Vehicle1 {
	public void speed() {
		super.speed(); //calling parent function
		System.out.println(140);
	}
}

public class Super10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 ob = new Car1();
		ob.speed();

	}

}
