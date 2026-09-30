package Collections;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> ob = new LinkedHashMap<Integer, String>();
		//to add value
		ob.put(1,"aiswariya");
		ob.put(2,"anamika");
		ob.put(3,"lamiya");
		//accepts duplicate values
		ob.put(4,"aiswariya");
		ob.put(5,"mamitha");
		
		System.out.println(ob);
		
		//to display sequentially
		Set mapset = ob.entrySet();
		Iterator itr = mapset.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			//to display key 
			//System.out.println(entry.getKey());
			//to display value 
			//System.out.println(entry.getValue());
			//to display key and value
			//to display key 
			System.out.println(entry.getKey()+"="+entry.getValue());

	}
	}

}
