package Oopsconcept;

public class StudentEncapsulation12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we can access data from another class only by creating object to that class / inherit the class
		StudentinfoEncapsulation13 ob = new StudentinfoEncapsulation13();
		ob.setemailid("Aishu", "Aishu@123");
		System.out.println(ob.getemailid());
		System.out.println(ob.getpswd());
		//or
		System.out.println("another way");
		String nam = ob.getemailid();
		String nam2 = ob.getpswd();
		System.out.println(nam+"\t"+nam2);
		

	}

}
