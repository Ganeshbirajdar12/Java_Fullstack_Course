package multithreading;

public class Threading_1 extends Thread {

	public void run()
	{
		System.out.println("natural Number : ");
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		System.out.println("End of first Thread"+Thread.currentThread().threadId());
	}
}

class Thread2 extends Thread
{
	
	public void run()
	{
		System.out.println("Even Numbers");
		for(int i=2; i<=20; i+=2)
		{
			System.out.println(i);
		}
		System.out.println("End of second Thread"+Thread.currentThread().threadId());
	}
}

class Thread3 extends Thread
{
	public void run()
	{
		System.out.println("odd Numbers");
		for(int i=1; i<=30; i+=2)
		{
			System.out.println(i);
		}
		System.out.println("End of  Thread"+Thread.currentThread().threadId());
	}
}

class Main 
{
	public static void main(String[] args) {
		Threading_1 t1 = new Threading_1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		t1.setPriority(7);
		t2.setPriority(10);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
