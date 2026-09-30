package Methodandconstructor;

public class Methodprojava {
	public void sum() {
		int a=23;
		float b=10.90f; //local variables
		float sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10,b=100;
		System.out.println("Maximum is :"+(Math.max(a, b))); //predefined methods
		
		Methodprojava s1 = new Methodprojava();   //for that local variable we are creating object to call
		s1.sum();
		

	}

}
