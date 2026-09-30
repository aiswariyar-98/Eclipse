package controlstatements;

public class Nestedforloop8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Increment order");
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println( );
		}
		System.out.println("Decrement order");
		for (int i =5;i>=1;i--) { 
			for (int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println( );
		}

	}

}
