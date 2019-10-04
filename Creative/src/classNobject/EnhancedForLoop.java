package classNobject;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
int D2[][] = {
				
				{1,2,3},
				{8,9,7,0},
				{7,6,5}
		};

		for(int k[] : D2) //Here you don't need to focus on the length 
		{
			for(int l :k)
			{
				System.out.print(" " +l);
			}
			System.out.println();
		}

	}

}
