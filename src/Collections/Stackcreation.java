package Collections;

import java.util.Stack;

public class Stackcreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack ob = new Stack();
		//to add element
		ob.push(10);
		ob.push(20);
		ob.push(30);
		ob.push(40);
		ob.push(50);
		//to display element of ob
		System.out.println(ob);
		ob.push(60);
		System.out.println("elements : "+ob);
		
		//to show the top element
		System.out.println("top element : "+ob.peek());
		
		//to remove top element
		ob.pop();
		System.out.println("elements : "+ob);
		
		System.out.println("current top element : "+ob.peek());

	}

}
