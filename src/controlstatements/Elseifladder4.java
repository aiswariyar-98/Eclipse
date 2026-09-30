package controlstatements;

public class Elseifladder4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "Chrome";
		if (browser == "Safari") {
			System.out.println("Safari is opening");
		}
		else if (browser=="Edge") {
			System.out.println("Edge is opening");
		}
		else if (browser=="Firefox" ) {
			System.out.println("Firefox is opening");
		}
		else if (browser == "Chrome") {
			System.out.println("Chrome is opening");
		}

		else {
			System.out.println("Please check ur browser name");
		}
	}

}
