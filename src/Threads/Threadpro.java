package Threads;

class Trialthread extends Thread {
	public void run() {
		try {
		for (int i=1;i<=5;i++) {
			System.out.println("New Thread");
			
				Thread.sleep(1000);
			}
		}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}


public class Threadpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trialthread t = new Trialthread();
		t.start(); //to run the thread we create we need to give start function
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("main thread");
				Thread.sleep(1000);
			}
		}
		catch (Exception e ) {
			System.out.println(e);
		}

	}

}
