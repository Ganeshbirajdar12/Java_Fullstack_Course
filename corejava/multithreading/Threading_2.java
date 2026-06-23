package multithreading;

public class Threading_2 extends Thread  {
	public void run()
	{
		try
		{
			for(int i =0; i<5; i++)
			{
			
				Thread.sleep(200);
				System.out.println("Good Morning ");
			}
		}
		
		catch (InterruptedException e)
		{
			System.out.println("Thread is interrupated");
		}
		System.out.println("End Of First Thread");
	}

}

class Even extends Thread
{

	public void run() {
		for (int i=2; i<=10; i+=2)
		{
			System.out.println(i);
		}
		System.out.println("End of Second Thread");
	}
}

class Odd extends Thread
{
	public void run()
	{
		try {
		for (int i=1; i<=10; i+=2)
		{
			Thread.sleep(5000);
			System.out.println(i);
		}
		}
		catch(Exception e){
			System.out.println("Thread is interrupated");
		}
		System.out.println("End of Third Thread");
		
	}
	
	public static void main(String[] args) {
		Threading_2 t1 = new Threading_2();
		Even t2 = new Even();
		Odd t3 = new Odd();
		
		t1.start();
		t2.start();
		t3.start();
	}
	
}
