package Oopsconcept;
//parent class
class Company {
	String worktype;
	public void income() {
		int salary = 55000;
		System.out.println("Salary = "+salary);
	}
}

//child class
class Employee extends Company {
	String designation;
	public void time() {
		int workinghours = 7;
		System.out.println("Working hours = "+workinghours);
	}
}

public class Singlework {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob = new Employee();
		System.out.println("Worktype = "+(ob.worktype="Permanent"));
		ob.income();
		System.out.println("Designation = "+(ob.designation="Software Tester"));
		ob.time();

	}

}
