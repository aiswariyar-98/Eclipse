package Important;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "Automation";
		String reverse="";
		for (int i = original.length()-1;i>=0;i--) {
			reverse += original.charAt(i);
		}
		System.out.println("Reverse = "+reverse);

	}

}
