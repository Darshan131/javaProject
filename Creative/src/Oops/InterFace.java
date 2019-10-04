package Oops;

public class InterFace {

	public static void main(String[] args) {
		
		Writer p= new Pen();
		Kit k  = new Kit();
		Writer pc = new Pencil();
		k.doSomething(pc);
		
				

	}

}

class Writer
{
	public void write()
	{
		
	}
}

class Pen extends Writer
{
	public void write()
	{
		System.out.println("I am Pen");
	}
}

class Pencil extends Writer
{
	public void write()
	{
		System.out.println("I am Pencil");
	}
}

class Kit
{
	public void doSomething(Writer pc)
	{
		pc.write();
	}
}