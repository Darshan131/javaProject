package Oops;

public class interFace2 {

	public static void main(String[] args) {
		
		WWE h = new WWE();
		Producer j = new john(); //As Producer class is now a abstract class and we are using it as Reference 
		Producer b = new Broke();
		h.HHH(j); 
		
		
	}

}

interface Producer{
	public abstract void wwe();
	
}

class john implements Producer  //in future suppose i need to extends more class but java multiple inheritance is not supported
{
	public void wwe() 
	{
		System.out.println("you can't see me!");
	}
}
class Broke implements Producer
{
	public void wwe()
	{
		System.out.println("i will break you");
	}
}
 class WWE
 {
	 public void HHH(Producer j) //Object of Producer though Producer is the SUPER-CLASS for john & Broke we can use it as Reference 
	 {							// to it Sub-classes & it doesn't matter what the arguments you are passing
		 j.wwe();				//As there is method OverRiding 
	 }
 }
 
 //Interface & Abstract are similar Only Difference is that in abstract class we can have both Defined and Declared methods Where as in 
 //in Interface when can have only abstract methods(By default public abstract is there we don't need to specify)
 //In interface we can have only Declared methods only if we try to define any methods within interface it gives compile time error
 // we can create Reference of interface not Object 
 //we can Implements Multiple Interfaces But we cannot extends multiple classes 