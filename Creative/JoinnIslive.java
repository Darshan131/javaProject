package threadDemo;

public class JoinnIslive  
   {
	public static void main(String[] args) throws Exception 
	{

	Thread t1 = new Thread(() ->
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println("Show me ");
		try {Thread.sleep(500);} catch(Exception e) {}
		}
	});
	Thread t2 = new Thread(() ->
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println("Show me what");
		try {Thread.sleep(500);} catch(Exception e) {}
		}
	});
	
	t1.start();
	try {Thread.sleep(20);}catch(Exception e) {} 
	t2.start();	
	
	//System.out.println(t1.isAlive()); //isALive() is the method used to detect if the Thread is in Active state or not
										//isAlive() will be no more if Thread work is completed 
									//t2 is executing Thread2 and Thread1 is executing Thread1 so what main doing? 
	t1.join();						//join() is used to halt main() Thread until work of t1 & t2 haven't completed
	t2.join();
	System.out.println(t2.isAlive()); //here it will give u false statement because t2 is no more 
	System.out.println("bye");					//so its printing in Between t1 and t2 'bye'

	}

}
