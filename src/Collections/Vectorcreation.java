package Collections;


import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Vectorcreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li =new Vector<Integer>();
		
		li.add(98);
		li.add(97);
		li.add(30);
		li.add(45);
		li.add(87);
		
		System.out.println(li); //display elements
		System.out.println("size ="+li.size()); //to get size
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
		
		List li1 =new Vector();//adding all elements of li to li1
		li1.addAll(li);
		System.out.println(li1);
		
		li1.removeAll(li1);
		System.out.println(li1);
		
		
		li.add(87); //accepts duplicate
		
		li.add(null); //accepts null
		System.out.println(li);
		
		System.out.println(li.contains(45)); //returns true/ false

	}

}
