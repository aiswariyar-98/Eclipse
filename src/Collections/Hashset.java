package Collections;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> ob = new HashSet<String>();
		
		ob.add("aiswariya");
		ob.add("rahul");
		ob.add("ramya");
		ob.add("aparna");
		ob.add("harini");
		//doesnt follow any order
		System.out.println(ob);
		
		for(String data : ob) {
			System.out.println(data);
		}
		//doesnt accept duplicate values
		ob.add("aparna");
		System.out.println(ob);
		//accepts null
		ob.add(null);
		System.out.println(ob);
		
		

	}

}
