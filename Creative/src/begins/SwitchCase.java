package begins;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Choice");
		
		int n = scan.nextInt();
		
		
		switch(n)
		{
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:							// if we don't apply BREAK after each CASE it PRINT all CASES After the selected CASE.
			System.out.println("THREE");
			break;
		case 4:							// BREAk statement make control let out of switch
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
			default:
				System.out.println("No Match");
		}

	}

}
