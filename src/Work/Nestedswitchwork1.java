package Work;

public class Nestedswitchwork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Available options"+"\n"+"--------------------");
		System.out.println("1.School of computer science"+"\n"+"a.Department of informatics"+"\n"+"b.Department of machine learning");
		System.out.println("2.School of business"+"\n"+"a.Department of commerce"+"\n"+"b.Department of purchasing");
		System.out.println("3.School of engineering"+"\n"+"a.Department of mechanical engineering"+"\n"+"b.Department of mechatronics engineering");
		System.out.println("");
		System.out.println("The option you have chosen is :");
		int university = 2;
		char department = 'a';
		switch (university) {
			case 1 : System.out.println("1.School of computer science");
			switch (department) {
			case 'a' :System.out.println("a.Department of informatics");
			break;
			case 'b' :System.out.println("b.Department of machine learning");
			break;
			}break;
			case 2 : System.out.println("2.School of business");
			switch (department) {
			case 'a' :System.out.println("a.Department of commerce");
			break;
			case 'b' :System.out.println("Department of purchasing");
			break;
			}break;
			case 3 : System.out.println("3.School of engineering");
			switch (department) {
			case 'a' :System.out.println("a.Department of mechanical engineering");
			break;
			case 'b' :System.out.println("b.Department of mechatronics engineering");
			break;
			}break;
			default : System.out.println("Invalid");
			}
	}

}
