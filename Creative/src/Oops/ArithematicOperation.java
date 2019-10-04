package Oops;

public class ArithematicOperation {

	public static void main(String[] args) {
		
		AdvCal obj = new AdvCal();
		int result1 = obj.add(100, 500);
		int result2 = obj.sub(5,6);
		int result3  =obj.mult(4, 3);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}

	class Calculator  //super class
	{
		public int add(int a,int b)
		{
			return a+b;
		}

		}
					//single level Inheritance 
	
	
	class CalAdv extends Calculator //sub class of Calculator
	{
		public int sub(int x,int y)
		{
			return x-y;															//Multi Level Inheritance
		}
	}
	
	class AdvCal extends CalAdv
	{
		public int mult(int p, int q)
		{
			return p*q;
		}
	}
