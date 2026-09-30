package operators;

public class Typecasting7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//widening typecasting
		char exp = 'A';
		int num = exp;
		float deci = num;
		
		System.out.println("widening typecasting"+"\n----------------------");
		System.out.println("exp="+exp+"\nnum="+num+"\ndeci="+deci);
		
		//narrowing typecasting
		float deci1=105.6f;
		int num1=(int) deci1;
		char exp1=(char)num1;
		
		System.out.println("narrowing typecasting"+"\n----------------------");
		System.out.println("exp1="+exp1+"\nnum1="+num1+"\ndeci1="+deci1);
		
		
		
		

	}

}
