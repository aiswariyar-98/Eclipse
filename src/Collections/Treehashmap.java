package Collections;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treehashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> ob = new TreeMap<Integer, String>();
		//to add value
		ob.put(1,"aiswariya");
		ob.put(7,"anamika");
		ob.put(3,"lamiya");
		//accepts duplicate values
		ob.put(2,"aiswariya");
		ob.put(5,"mamitha");
		//it display in ascending order
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
