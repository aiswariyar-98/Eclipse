package Oopsconcept;


	//parent class
	class Animal2 {
		String colour;
		public void eat() {
			System.out.println("Animal eating........");
		}
	}
	//child1 class
	class Cat2 extends Animal2 {   //inheriting parent class
		String breed;
		public void sound() {
			System.out.println("Meow Meow......");
		}
	}
	//child2 class
	class Cat3 extends Animal2 {
		int age;
		public void play() {
			System.out.println("Kitten is playing");
		}
	}
	public class Hierachichalinheritance3 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat2 ob = new Cat2();
		Cat3 ob1 = new Cat3();
		System.out.println("Colour = "+(ob.colour="Orange"));
		ob.eat();
		System.out.println("Breed = "+(ob.breed="Pussy"));
		ob.sound();
		
		System.out.println("Colour = "+(ob1.colour="Red"));
		ob1.eat();
		System.out.println("Age = "+(ob1.age=5));
		ob1.play();
		
		

	}

}
