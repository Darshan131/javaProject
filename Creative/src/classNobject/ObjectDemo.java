package classNobject;


class Calc
{
	int num1,num2;
	int result;
		
	public void perform()
	{
		result = num1 + num2;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		
		Calc obj = new Calc(); //new is the keyword used to create Object and to allocate memory for them
								// "here obj is the Reference variable for Object Calc() also a Constructor"  
		//obj.num1 = 3;
		//obj.num2 = 5;
		//obj.perform();                       // and how much memory you need is defined by the constructor
		System.out.println(obj.result);     //ByDefault value of int is ZERO

	}      //Constructor is a block of code that initializes the newly created object.
			//a constructor also contains collection of statements(i.e. instructions) that are executed at time of Object creation.

}


/*
 * 
 *  we need Object in-order to access variable which are not "static"
 *  if a variable or Object is static we don't need Object to access that variable
 *  
 *  
 *  
 *  
 * */
 