package classNobject;

public class InnerDemo {

	public static void main(String[] args) {
		
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj1 = obj.new Inner(); //In-order to access nested class we need Outer class and
		obj1.display();								    // for Object of Inner class we need Object Outer class
	}

}

class Outer
{
	int i; // if we make it static then in main method we don't need Object to access the particular value,directly using class name only
	void show()
	{
		
	}
	
		class Inner    //Outer$inner.class
		{
			public void display()
			{
			System.out.println("Inside Inner Class");
			}
		}
}
