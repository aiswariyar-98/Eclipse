package Collections;


import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> ob = new TreeSet<String>();
		
		ob.add("aiswariya");
		ob.add("rahul");
		ob.add("ramya");
		ob.add("aparna");
		ob.add("harini");
		//follows ascending order
		System.out.println(ob);
		
		for(String data : ob) {
			System.out.println(data);
		}
		//doesnt accept duplicate values
		ob.add("aparna");
		System.out.println(ob);
		
	

	}

}
