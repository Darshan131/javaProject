package classNobject;

public class Array {

	public static void main(String[] args) {
		
		
		int num[] = new int [4]; //Array is an Object so we use new keyword 
								// size of Array is fixed and default value of Array is ZERO
		//If u know exact value then can directly write  int num[] = {1,2,3,4};
		num[0] = 100;
		num[1] = 200;
		num[2] = 300;
		num[3] = 400;
		
		for(int i=0;i<4;i++)
		{
		System.out.println(num[i]);
		}

	}

}
