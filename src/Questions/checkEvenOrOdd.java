package Questions;
import java.util.*;
public class checkEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Take a user Input which is an Integer . If the input value is even or odd 
		
		int number ; 
		Scanner scan = new Scanner(System.in);
		
//		Taking Input for Checking 
		number = scan.nextInt();
		if (number%2==0)
			System.out.print("EVEN");
		else 
			System.out.println("ODD");
		}
	

}
