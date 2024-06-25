package Questions;
import java.util.*;
public class sumOfAnglesTriangleProblem {
public static void main (String args[]) {
	
	// TODO Auto-generated method stub
	float angle1 , angle2 , angle3;
	float sum ;
	Scanner scan = new Scanner(System.in);
	angle1=scan.nextFloat();
	angle2=scan.nextFloat();
	angle3=scan.nextFloat();
	sum =  angle1+angle2+angle3;
	
	
	if (angle1>0&&angle2>0&&angle3>0&& sum==180)
	{
		System.out.println("Valid Triangle");
		
	}
	else
		System.out.println("Invalid Triangle");
}
}
