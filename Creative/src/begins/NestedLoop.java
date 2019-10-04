package begins;

public class NestedLoop {

	public static void main(String[] args) {
		
		for(int i= 1;i<=4;i++)
		{
			for(int j = 1;j<=4;j++)
			{
				if(i==1 || j==1 || j==4 || i==4 )
					{
					System.out.print(" *");
					}
				else
				{
					System.out.print("  ");
				}
			
				
			}
			System.out.println();
		}
	}

}

/*
 * 	for(char ch1=1;i<=65;i++)
 * 		{
 * 			for(char ch=1;ch<=i;ch++)
 * 			{
 * 				System.out.println(ch);  A
 * 										 A B
 * 										 A B C
 * 				}
 *
 * 			}
 */
