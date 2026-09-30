package Methodandconstructor;

public class Paraconstructor9 {
	float area; //instance variable
	public Paraconstructor9(float l,float b) { //parameterized constructor
		// TODO Auto-generated constructor stub
		area = l*b;
		System.out.println("Area = "+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paraconstructor9 ob = new Paraconstructor9(12.5f,15.5f);
	}

}
