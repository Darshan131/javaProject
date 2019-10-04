package Oops;

public class ConstructorOverRiding {

	public static void main(String[] args) {
		
		B obj = new B(5);

	}

}

class A
{
	public A()
	{
		System.out.println("in A");
	}
	public A(int i)
	{
		System.out.println("In I of Constructor");
	}												 //In-Order to call each Constructor we need to Create  Object 
													//In this case it will call specified parameter of Sub-Class as well as the Default Constructor of  
}													//Super-Class

class B extends A
{
	public B()
	{
		System.out.println("lIn B");
	}
	public B(int i)
	{
		System.out.println("In i of Constructor B");
	}
}