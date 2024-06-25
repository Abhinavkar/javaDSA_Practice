package Questions;
import java.util.*;

public class leapYearProblem {
	public static void main (String args[])
	
	{
//		check whether the year is a  leap year or not 
		
	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();
	if((year%400 ==0 )||((year%4==0) && (year%100!=0 ) ))
	{
	System.out.println("Its a Leap Year");
	}
	else 
		System.out.println("no its not a leap year");
}
	}

