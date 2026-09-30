package operators;

public class Work6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		//Using increment and decrement operator find the postfix and prefix value
		
		int value1 = a++;
		System.out.println("Postfix Increment ="+value1+"\t"+"A ="+a);
		
		int value2 = ++a;
		System.out.println("Prefix Increment ="+value2+"\t"+"A ="+a);
		
		int value3 = a--;
		System.out.println("Postfix Decrement ="+value3+"\t"+"A ="+a);
		
		int value4 = --a;
		System.out.println("Prefix Decrement ="+value4+"\t"+"A ="+a);
		

	}

}
