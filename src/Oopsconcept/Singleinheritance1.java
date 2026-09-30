package Oopsconcept;

//parent class
class Animal {
	String colour;
	public void eat() {
		System.out.println("Animal eating........");
	}
}
//child class
class Cat extends Animal {   //inheriting parent class
	String breed;
	public void sound() {
		System.out.println("Meow Meow......");
	}
}

public class Singleinheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat ob = new Cat();
		System.out.println("Colour : "+(ob.colour="orange"));
		ob.eat();
		System.out.println("Breed : "+(ob.breed="pussy cat"));
		ob.sound();

	}

}
