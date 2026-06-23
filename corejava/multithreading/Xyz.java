package multithreading;

public class Xyz extends Thread {

	public void run()
	{
		System.out.println(Thread.currentThread().threadId());
	}
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().threadId());
		Xyz x = new Xyz();
		x.start();
		
		Xyz x1 = new Xyz();
		x1.start();
	}
}
