package operators;

public class Bitwiseoperator5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10,n2=5;
		System.out.println("Binary value of n1="+Integer.toBinaryString(n1));
		System.out.println("Binary value of n2="+Integer.toBinaryString(n2));
		
		System.out.println("bitwise or ="+(n1|n2));
		System.out.println("bitwise and ="+(n1&n2));
		System.out.println("bitwise xor ="+(n1^n2));
		System.out.println("bitwise compliment of n1 ="+(~n1));

	}

}
