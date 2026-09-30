package Oopsconcept;
//grand parent class
class Animal1 {
	String colour;
	public void eat() {
		System.out.println("Animal eating........");
	}
}
//parent class
class Cat1 extends Animal1 {   //inheriting parent class
	String breed;
	public void sound() {
		System.out.println("Meow Meow......");
	}
}
//child class
class Kitten extends Cat1 {  //inheriting parent class so both grandparent and parent are inherited
	int age;
	public void play() {
		System.out.println("Kitten is playing");
	}
}

public class Multilevelinheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kitten ob = new Kitten();
		System.out.println("Colour = "+(ob.colour="Orange"));
		ob.eat();
		System.out.println("Breed = "+(ob.breed="Pussy"));
		ob.sound();
		System.out.println("Age = "+(ob.age= 2));
		ob.play();

	}

}
