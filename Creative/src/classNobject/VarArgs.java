package classNobject;

class Calculator
{
	public  int add(int ...n) //work like a Array {3,42,3,4,3,4,3} VarArg method it is called Variable Length Arguments
	{
		int sum = 0;
		for(int i :n)
		{
			sum = sum+i;
		}
		return sum;
	}
	
	
}

public class VarArgs {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		System.out.println(obj.add(3,42,3,4,3,4,3));

	}

}


