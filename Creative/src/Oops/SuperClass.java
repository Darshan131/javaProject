package Oops;

public class SuperClass {

	public static void main(String[] args) {
		
		Z obj = new Z();


	}

}			//In Constructor whenever Object is Created it is Called there are two Constructor here, but with single Object two of the constructors are 
			//called it is Because whenever you create the Object of SUB class it will automatically call the super class too

class X
{
	public X()
	{
		System.out.println("In Constructor A");
	}
	
}
	class Z extends X
	{
		public Z()
		{
			System.out.println("In constructor B");
		}
	}
	
