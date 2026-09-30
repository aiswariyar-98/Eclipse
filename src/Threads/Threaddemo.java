package Threads;

public class Threaddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread(); //we are creating reference to call current thread
		System.out.println("current thread = "+t);
		
		String threadname = Thread.currentThread().getName(); //since it is a name we are using string
		System.out.println("thread name = "+ threadname);
		
		//change name of thread
		t.setName("new thread");
		System.out.println("thread = "+t);
		String newname = Thread.currentThread().getName();
		System.out.println("newname ="+newname);
		
		try {
			for (int i=1;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000); //to pause for a second
			}
		}
		catch (Exception e){
			System.out.println(e);
			
		}
	}

}
