package threadDemo;

public class AnnonymousClass {

	public static void main(String[] args) {
		
									//we can create a thread by using extending it and by implementing
		Thread t1 = new Thread(()->  //Lambda Expression is defined using ->
		{
		for(int i = 1;i<=5;i++) {
		System.out.println("hi..");
		try{Thread.sleep(500);} catch(Exception e) {}
		}
	});
		Thread t2 = new Thread(() -> // Runnable Interface is Functional interface so we can use lambda expression in -order to reduce lines of codes
		{   for(int i = 1;i<=5;i++) {
			System.out.println("hello..");
			try{Thread.sleep(500);} catch(Exception e) {}
		}
		});
		t1.start(); //Runnable doesn't have start() but have only run() and start() calls run() methods
		try {Thread.sleep(50);} catch(Exception e){}
		t2.start();

	}

}


/* Though we are using the class only once so why to create separate class for it so use Anonymous class here
 * 
 * class Hii implements Runnable
{
	public void run() {
		for(int i = 1;i<=5;i++) {
		System.out.println("hi..");
		try{Thread.sleep(500);} catch(Exception e) {}
		}
	}
	
}
class Hello implements Runnable
{
	public void run()
	{   for(int i = 1;i<=5;i++) {
		System.out.println("hello..");
		try{Thread.sleep(500);} catch(Exception e) {}
		}
	}
	
*/
