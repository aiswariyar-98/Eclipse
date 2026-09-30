package Oopsconcept;

public class Methodoverloading7 {
	//we can use same function name for multiple function in same class but it should be different by no.ofparameters,datatype of parameters,order of parameters
	public void add() {
		int a=15,b=25,sum;
		sum = a+b;
		System.out.println("default = "+sum);
	}
	public void add(int a,int b) {
		int sum = a+b;
		System.out.println("adding parameters ="+sum);
	}
	public void add(int c,float d) {
		System.out.println("changing datatype ="+(c+d));
		
	}
	public void add(float c,int d) {
		System.out.println("interchanging datatype ="+(c+d));
	}
	public void add(int a,int b,int c) {
		System.out.println("different number of parameters="+(a+b+c));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading7 ob = new Methodoverloading7();
		ob.add();
		ob.add(15, 87);
		ob.add(57,85.5f);
		ob.add(78.9f,25);
		ob.add(15, 77, 86);

	}

}
