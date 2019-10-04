package Oops;

public class PrimitiveData {

	public static void main(String[] args) {
		
		int i = 5; //primitive data type where i is a variable 
		Integer j = new Integer(i); //Here Integer is class / non primitive data type  OR called Wrapper Class OR  Boxing
		
		int k = j.intValue(); //fetching the value and it is called Unboxing - wrapping
		
		Integer value = i; //AutoBoxing 
		
		int l = value; //autoUnboxing
	}

}


/* 
 * String str = "123";
 * 
 *  int n = Integer.parseInt(str); //parseInt is a static method so we need a class Name Integer
 *  System.out.println(n);
 * */
 