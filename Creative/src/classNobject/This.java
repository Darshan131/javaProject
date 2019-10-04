package classNobject;

public class This {

	public static void main(String[] args) {
		
		Con obj = new Con(4,5);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		

	}

}

	class Con
	{
		int num1;
		int num2;
		int resutl;
		
		
		public Con(int num1, int num2)
		{
			this.num1 = num1; //current Object
			this.num2 = num2; //Keyword THIS is a reference variable in Java that refers to the current object.
							  //It can be used to refer instance variable of current class.
							 //It can be used to invoke or initiate current class constructor.
							 //It can be passed as an argument in the method call.
			
		}
	}
