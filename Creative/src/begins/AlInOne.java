package begins;

public class AlInOne {

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		int num = 5; //4 bytes -> 32bits -> -2,14,74,83,648 to 2,14,74,83,747
		num = 8;
		System.out.println(num);
		
		float percent1 = 5.5f; // 4 bytes
		double percent = 5.5; // 8 bytes, by default 5.5 is floating point number 
		
			//in_order to declare small value we should use small data types in-order save memory.
			
			//int, float, double
		
		byte b = 5;  // 1  byte -> 8 bit -> -128 to 127
		short s = 5; // 2 byte -> 16 bit => -32768 to 32767
		long l = 5000000000000000000l; //8 byte
		
		char c = 'A';
		c = 66; // ASCII values a = 97 to z = 122 and A = 65 to Z = 90
		System.err.println(c);
		
		double d1 = 5; // though it is Integer value double support Integer value
						// implicit conversion
		
		int k = (int)5.6; //type casting explicit conversion 
		System.out.println(k);
		
			/* 
			 Proper Naming Convension in java
			 
			 Variable
			 	abc
			 	
			 Constant
			 	ABC
			 	
			 Constructor
			 	Abc
			 	
			 Method
			 	abc()
			 	
			 Interface
			  	Stretchable
			 
			  */
		

	}

}
