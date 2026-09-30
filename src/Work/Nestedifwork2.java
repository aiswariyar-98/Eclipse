package Work;

public class Nestedifwork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15;
		int weight = 52;
		if (age>=18) {
			if (weight >= 50) {
				System.out.println("Eligible to donate blood");
			}
			else {
				System.out.println("Not eligible");
			}
		}
		else {
			System.out.println("Not eligible");
		}

	}

}
