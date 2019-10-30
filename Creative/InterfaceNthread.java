package threadDemo;

public class InterfaceNthread {

	public static void main(String[] args) {
		Runnable obj = new Thread1();
		Runnable obj2 = new Thread2();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try {Thread.sleep(50);} catch(Exception e) {}
		t2.start();

	}

}
class Thread12 implements Runnable
{
	 public void run()
	 {
		 for(int i= 1;i<=5;i++)
		 {
		 System.out.println("Hii..!!");
		 try {Thread.sleep(500);} catch(Exception e) {}
		 }
	 }
}
class Thread23 implements Runnable
{
	public void run()
	{
		for(int i =1 ;i<=5;i++)
		{
		System.out.println("Hello..!!");
		try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}