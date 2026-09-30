package Oopsinterface;

public class Birdsc implements Bird{ //class can inherit interface using implements

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bird ob = new Bird();---------cannot create object for interface
		Bird ob = new Birdsc();//upcasting we can create object for subclass
		ob.sound();
		Birdsc ob1 = new Birdsc();//subclasss of interface create object
		ob1.sound();

	}

@Override
public void sound() {
	// TODO Auto-generated method stub
	System.out.println("Tweet....Tweet");
	
}

}
