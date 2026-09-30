package controlstatements;

public class Switchstatement5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "Edge";
		switch (browser) {
		case "chrome" : System.out.println("chrome will open");
		break;
		case "Edge" : System.out.println("edge will open");
		break;
		case "firefox" : System.out.println("firefox will open");
		break;
		default : System.out.println("Invalid browser name");
		}

	}

}
