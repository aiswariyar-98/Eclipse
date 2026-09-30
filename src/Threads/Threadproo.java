package Threads;

class Mathss{
	 synchronized void multable(int num) {
		for(int i = 1; i<=10; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
			try
			{
				Thread.sleep(1000);	
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class Thread1 extends Thread{
	Mathss obj;
	public Thread1(Mathss obj){
		this.obj = obj;
	}
	@Override
	public void run() {
		//Mathss.multable(2);
		obj.multable(2);
		
	}
}
class Thread2 extends Thread{
	Mathss obj;
	public Thread2(Mathss obj){
		this.obj = obj;
	}
	@Override
	public void run() {
		//Mathss.multable(3);
		obj.multable(3);
	}
}
class Thread3 extends Thread{
	Mathss obj;
	public Thread3(Mathss obj){
		this.obj = obj;
	}
	@Override
	public void run() {
		//Mathss.multable(6);
		obj.multable(6);
	}
}

public class Threadproo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mathss obj = new Mathss();
		
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		Thread3 t3 = new Thread3(obj);
		
		t1.start();
		t2.start();
		t3.start();
	

	}

}
