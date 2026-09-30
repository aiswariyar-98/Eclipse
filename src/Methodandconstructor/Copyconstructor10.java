package Methodandconstructor;

public class Copyconstructor10 {
	float l,b,area;
	public Copyconstructor10() {
		// TODO Auto-generated constructor stub
		l=2.2f;
		b=2.5f;
		area = l*b;
	}
	public void display() {
		System.out.println(area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copyconstructor10 ob = new Copyconstructor10();
		ob.display();
		Copyconstructor10 ob1 = ob;
		ob1.display();

	}

}
