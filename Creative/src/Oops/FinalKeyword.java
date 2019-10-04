package Oops;

public class FinalKeyword {

	public static void main(String[] args) {
		
		FinalAgain obj = new AgainFinal();
		obj.show();
	}

}

class FinalKey
{
	final int i = 0; //Once the variable is Declared as Final We cannot change OR we can't re-assign that  value again though it is Constant
	public void Finalkey()
	{
		int i =10;
	}
	
}

//final 
class FinalAgain //if a class i declared as final no other class can Override that class 
{
	public void show()
	{
		System.out.println("In show");
	}
}
 class AgainFinal extends FinalAgain
 {
	public void show()
	 {
	 System.out.println("IN AgainFinal");
	 }

	}
 
 /* 
  * using final with class no Other class can Inherit 
  * using final with method no other methods can override
  * using final with variable it is constant i;e means can't be changed 
  */
