package threadDemo;

public class ClassThread {

	public static void main(String[] args) {
		
		Thread1 obj = new Thread1();
		Thread2 obj2 = new Thread2();
		
		obj.start();
		try {Thread.sleep(90);} catch(Exception e) {}
		obj2.start();
		
	}

}

class Thread1 extends Thread
{
	 public void run()
	 {
		 for(int i= 1;i<=5;i++)
		 {
		 System.out.println("Hii..!!");
		 try {Thread.sleep(1000);} catch(Exception e) {}
		 }
	 }
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i =1 ;i<=5;i++)
		{
		System.out.println("Hello..!!");
		try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}
