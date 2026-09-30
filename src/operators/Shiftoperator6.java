package operators;

public class Shiftoperator6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 2,j=-3;
		System.out.println("Binary value of i="+(Integer.toBinaryString(i)));
		System.out.println("Binary value of j="+(Integer.toBinaryString(j)));
		
		//left shift operator
		System.out.println(i<<2);
		System.out.println("binary value of i<<2="+(Integer.toBinaryString(i<<2)));
		
		System.out.println(j<<1);
		System.out.println("binary value of j<<1="+(Integer.toBinaryString(j<<1)));
		
		//right shift operator
		System.out.println(i>>3);
		System.out.println("binary value of i>>3="+(Integer.toBinaryString(i>>3)));
		System.out.println(j>>4);
		System.out.println("binary value of j>>4="+(Integer.toBinaryString(j>>4)));
		
		//unsigned right shift operator
		System.out.println(i>>>3);
		System.out.println("binary value of i>>>3="+(Integer.toBinaryString(i>>>3)));
		System.out.println(j>>>4);
		System.out.println("binary value of j>>>4="+(Integer.toBinaryString(j>>>4)));
		

	}

}
