package operators;

public class operators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//unary operator
		//1.unary -
		int a =5;
		a = -a;
		System.out.println(a);
		//2.unary not !--------->boolean values
		boolean b=true;
		System.out.println(!b);
		//3.increment
		//postincrement
		int i = 5;
		i++;
		System.out.println(i);
		//preincrement
		++i;
		System.out.println(i);
		//4.decrement
		int j = 10;
	    //postdecrement
		j--;
		System.out.println(j);
		//predecrement
		--j;
		System.out.println(j);
		//5.bitwise compliment
		int k = 5;
		System.out.println(~k);
		
		//increment
		//prefix it only works while storing in an variable
		int z = 10;
		int value1 = ++z;
		System.out.println("Value1 = "+value1+"\t"+"Z ="+z);
		//postfix since variable sees operands first it will not increment
		int value2 = z++;
		System.out.println("Value2 = "+value2+"\t"+"Z ="+z);
		//decrement
		//postfix since variable sees operands first it will not decrement
		int value3 = z--;
		System.out.println("Value3 = "+value3+"\t"+"Z ="+z);
		//prefix it only works while storing in an variable
		int value4 = --z;
		System.out.println("Value4 = "+value4+"\t"+"Z ="+z);
		
		//relational operator returns only boolean values
		//less than and less than equal to
		int x = 25;
		int y = 20;
		boolean val1= x<y;
		boolean val2= x<=y;
		
		System.out.println(val1);
		System.out.println(val2);
		
		//greater than and greater than equal to
		boolean val3= x>y;
		boolean val4= x>=y;
		
		System.out.println(val3);
		System.out.println(val4);
		
		//equal to equal and not equal
		boolean val5= x==y;
		boolean val6= x!=y;
		
		System.out.println(val5);
		System.out.println(val6);
		
		//assignment operator
		System.out.println(x+= y); //x = x+y value of x replaced every time
		System.out.println(x-= y); //x = x-y
		System.out.println(x*= y); //x = x*y
		System.out.println(x/= y); //x = x/y
		System.out.println(x%= y); //x = x%y
		System.out.println(x);
		System.out.println(y);
		
		//logical operator
		boolean v1 = x>y; //false
		boolean v2 = x<y; //true
		
		//logical not
		System.out.println("logical not =" + !v1); //true
		System.out.println("logical and =" + (v1&&v2)); //false
		System.out.println("logical or  =" + (v1||v2));  //true
		
		//ternary operator ?:
		int h;
		h = (x<y) ? (x+y) : (x-y);
		System.out.println("value of h =" + h);
		

	}

}
