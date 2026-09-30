package Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Collectionpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList li = new ArrayList();
		List li =new ArrayList();
		li.add("aiswariya");
		li.add(98);
		li.add("diya");
		li.add(89.9);
		li.add("lamiya");
		li.add(87.5);
		
		System.out.println(li); //display elements
		System.out.println("size ="+li.size()); //to get length
		System.out.println("3rd index value ="+li.get(3)); //random access
		
		//sequential access
		for (int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		Iterator itr = li.iterator(); //Iterator is a interface
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		li.remove(3);  //3rd element is removed
		System.out.println(li);
		
		List li1 =new ArrayList();//adding all elements of li to li1
		li1.addAll(li);
		System.out.println(li1);
		
		li1.removeAll(li1);
		System.out.println(li1);
		
		li.add("harini");
		li.add(87.5); //accepts duplicate
		
		li.add(null); //accepts null
		System.out.println(li);
		
		System.out.println(li.contains("lamiya")); //returns true/ false
		
		
		

	}

}
