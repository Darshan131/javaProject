package begins;

public class BreakNcontinue {

	public static void main(String[] args) {
		
		for(int i =1;i<=10;i++) //suppose i don't want to print number 7 t,then by using "continue" it will skip the rest of statement 
			//until and unless i=7 and from next iteration it will print 
			
		{
			if(i==7)
			{
				continue; //it skip just One iteration then use continue
			}
				
			System.out.println("value of is:"+i); 
		}

	}

}


/* for(int i = 1;i<=10;i++)
 * 	{
 * 		if(i<=5)
 * 			{
 * 			break; 
 * 					this statement make control to jump out of the Loop
 * 				and it will print up to 5 not rest of the numbers.
 * 				
 * 			}
 * 			System.out.println("value of i is:"+i)
 * 		}
 * */
