package Important;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "robot";
		String reverse = "";
		for (int i=(original.length()-1);i>=0;i--) {
			reverse += original.charAt(i);
		}
		
		if (original.equals(reverse)) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}

	}

}
