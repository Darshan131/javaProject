package begins;

public class Operator {

	public static void main(String[] args) {
		/* 
		 * Arithmetic (+, -, *, /, %)
		 *  Bitwise
		 *  Relational
		 *  Logical
		 * */
		int a = 4;
		int b = 5;
		a = a+b; //OR a+ = b;
								//a++ OR a+ =1 // a = a+1
		System.out.println(a);
		
		int x = 5;
		int y = 6;
		x = ++y; // pre-Increment
		x = y++;
		System.out.println("Value of X is "+x);
		System.out.println("Value of Y is "+y);
		
		
		
		int m = 6, n = 2;
		
		int result1 = m-n;
		int result2 = m+n;
		double result3 = m/n;
		int result4 = m%n;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3); 
		System.out.println(result4);
		
	}

}
