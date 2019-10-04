package begins;
import java.util.Scanner;

public class SelectionStatement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user Input ");
		
		int n = scan.nextByte();
		
		if(n%2==0) //if more then ONE statement then we need to use Curly Brackets or else we can use without it.
		
			System.out.println("Number you entered is EVEN");
		
		else
		
			System.out.println("Number you enters ia ODD");
		

	}

}
