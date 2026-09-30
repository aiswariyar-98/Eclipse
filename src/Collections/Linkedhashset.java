package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<String> ob = new LinkedHashSet<String>();
		
		ob.add("aiswariya");
		ob.add("rahul");
		ob.add("ramya");
		ob.add("aparna");
		ob.add("harini");
		
		//it maintain order
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
