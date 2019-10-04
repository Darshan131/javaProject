package classNobject;

public class A {

	public static void main(String[] args) {
		
		B obj = new B(10);
		System.out.println(obj.num1);
		System.out.println(obj.num2);

	}

}

	class B
	{
		int num1;
		int num2;
		int result;
		
		public B()  //Constructor is a block of code that initializes the newly created object.
		{
			num1 = 3;
			num2 = 4;
			
		}
		public B(int n)  //constructor Overloading with different signature 
		{
			
			num1 = n;
			num2 = n;
			System.out.println("In constructor");
		}
		
	}
