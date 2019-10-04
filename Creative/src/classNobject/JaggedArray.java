package classNobject;

public class JaggedArray {

	public static void main(String[] args) {
		
		int number[][] = {
				
				{1,2,3},
				{8,9,7},
				{7,6,5}
		};
		
		for(int i =0;i<3;i++) 			//if the value depend upon the ROW then
		{					  			// i<number.length for OUTER loop
			for(int j=0;j<3;j++)		//j<number[i].length		
			{
				System.out.print(" "+number[i][j]);
			}
			System.out.println();
		}
		
		

	}

}
