package Work;

public class Elseifladderwork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 95;
		char grade;
		if (marks >= 90)
		{
			System.out.println("Grade = "+(grade='A'));
		}
		else if ((marks>=70)&&(marks<=89)) {
			System.out.println("Grade = "+(grade='B'));
		}
		else if ((marks>=50)&&(marks<=69)) {
			System.out.println("Grade = "+(grade='C'));
		}
		else if (marks<50) {
			System.out.println("Grade = "+(grade = 'D'));
		}
	}

}
