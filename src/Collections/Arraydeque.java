package Collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Arraydeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PriorityQueue<String> ob = new PriorityQueue<String>();
		ArrayDeque<String> ob = new ArrayDeque<String>();
		
		ob.add("veni");
		ob.add("98");
		ob.add("killer");
		ob.add("null");
		ob.add("98");
		ob.add("anu");
		ob.add("raju");
		ob.add("75");
		
		System.out.println(ob);
		
		//to add the first value
		ob.addFirst("aiswariya");
		//to add the last value
		ob.addLast("megha");
		System.out.println(ob);
		//to get first value
		System.out.println(ob.peek());
		
		System.out.println(ob.peekFirst());
		//to get last value
		System.out.println(ob.peekLast());
		
		//to remove values
		ob.poll();
		System.out.println(ob);
		ob.pollFirst();
		System.out.println(ob);
		ob.pollLast();
		System.out.println(ob);
		
		
		
		

	}

}
