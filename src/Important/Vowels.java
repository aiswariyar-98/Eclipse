package Important;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am warrior";
		//since it has capital and small letter
		str = str.toLowerCase();
		int count = 0;
		System.out.println("vowles are :");
		for (int i =0;i<str.length();i++) {
			char c = str.charAt(i);
			
			if (c=='a' || c=='e' || c=='i' ||c=='o' || c=='u') {
				System.out.print(c + " ");
				count++;
			}
			
		}
		System.out.println();
		System.out.println("count of vowels = "+count);

	}

}
