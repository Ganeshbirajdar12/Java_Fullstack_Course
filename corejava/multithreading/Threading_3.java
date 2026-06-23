package multithreading;

public class Threading_3 extends Thread {
	
	public void run()
	{
		try {
		System.out.print("natural Number : ");
		for(int i=1; i<=10; i++)
		{
			Thread.sleep(2000);
			System.out.print(i +" ");
		}
		System.out.println();
		}
		catch(Exception e) {
			System.out.println("Thread is interrupated");
		}
		System.out.println("End of first Thread");
		
	}

}

class ABC extends Thread
{
	public void run()
	{
		try {
			System.out.print("Odd Numbers :  ");
			for(int i=1; i<=15; i+=2)
			{
				Thread.sleep(5000);
				System.out.print(i+" ");
				if(i == 5)
				{
					this.stop();
				}
			}
			System.out.println();
			}
			catch(Exception e) {
				System.out.println("Thread is interrupated");
				
			}
		System.out.println("End of Second Thread");
	}
}

class DEF extends Thread
{
	
	public void run()
	{
		System.out.print("Even Numbers");
		for(int i=2; i<=20; i+=2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("End of Third Thread");
	}
	
	public static void main(String[] args) throws InterruptedException {
		Threading_3 t1 = new Threading_3();
		ABC t2 = new ABC();
		DEF t3 = new DEF();
		t1.start();
		t1.join();
		
		t2.start();
		
		t2.join();
		
		t3.start();
}
}