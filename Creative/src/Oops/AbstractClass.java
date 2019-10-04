package Oops;

public class AbstractClass {

	public static void main(String[] args) {
		 
		Human obj = new Man(); //In-order to call a Method we need a Object and in Abstract class we cannot create Object of methods,
								// But we can declare methods a 
		
		Printer obj1  = new Printer();
		obj1.show(5.5);

	}

}


abstract class Human //abstract class
{
	public abstract void eat(); //if don't want method to be defined we can only Declare using only Abstract keyword
								//if any method is abstract class must be abstract
	
	public void walk()
	{
		
	}
}
class Man extends Human //whenever we extends any Abstract class we must implements members of that class
{						//Here Man class is a Concrete class 
	public void eat()
	{
		
	}
}

//why we need Abstract class

class Printer{
	void show(Number i) //Number is the super Class so whatever we take whether it is number or floating point number it will accept
	{					//Number has a lot sub-Classes
		System.out.println(i);
	}
	//void show(Double i)
	//{
		//System.out.println(i);
	//}
}