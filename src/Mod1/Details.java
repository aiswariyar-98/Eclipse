package Mod1;

public class Details {
	//public variable gloabally accessible
	public String name = "aiswariya";
	public int age = 28;
	//protected accessible within class,within package and subclass
	protected String address = "vadakara";
	//default accessible in class and within the package
	String country = "india";
	//private only within class
	private String mobnum = "1234567890";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details ob = new Details();
		System.out.println(ob.name);
		System.out.println(ob.age);
		System.out.println(ob.address);
		System.out.println(ob.country);
		System.out.println(ob.mobnum);

	}

}
