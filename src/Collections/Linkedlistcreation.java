package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Linkedlistcreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li =new LinkedList<String>();
		li.add("aiswariya");
		li.add("98");
		li.add("diya");
		li.add("89.9");
		li.add("lamiya");
		li.add("87.5");
		
		System.out.println(li); //display elements
		System.out.println("size ="+li.size()); //to get size
		System.out.println("3rd index value ="+li.get(3)); //random access
		
		//sequential access
		for (int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		//another method to display elements sequentially
		Iterator itr = li.iterator(); //Iterator is a interface 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		li.remove(3);  //3rd element is removed
		System.out.println(li);
		
		List li1 =new LinkedList();//adding all elements of li to li1
		li1.addAll(li);
		System.out.println(li1);
		
		li1.removeAll(li1);
		System.out.println(li1);
		
		li.add("harini");
		li.add("87.5"); //accepts duplicate
		
		li.add(null); //accepts null
		System.out.println(li);
		
		System.out.println(li.contains("lamiya")); //returns true/ false

	}

}
