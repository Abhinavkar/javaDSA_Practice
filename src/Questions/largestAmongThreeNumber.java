package Questions;
import java.util.*;
public class largestAmongThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a , b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a > b && a > c )
		{
			System.out.println("A is Largest");
		}
		else if (b>a && b>c)
		{
			System.out.println("B is largest");
		}
		else if(c>a&&c>b) {
			System.out.println("C is largest");
		}
		else 
			System.out.println("Equal");
	}

}
