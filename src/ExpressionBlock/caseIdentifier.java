package ExpressionBlock;
import java.util.*;
public class caseIdentifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TODO CASE SOLUTION 
		int number = 10 ;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		String size ; 
		switch(number) {
		case 10 : 
			size = "small";
			break ;
		case 20 : 
			size = "Medium";
			break ; 
		case 30 : 
			size = "Large";
			break ; 
		case 40 : 
			size = "Extra large" ;
			break ; 
			
		default: 
			size = "Unknown"; 
			break ;
		
		}

		System.out.println("size "+ size );
		
//		if there is no break statement then all cases will print from the case that matches 
		
	}
}
