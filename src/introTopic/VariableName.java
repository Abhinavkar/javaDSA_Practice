package introTopic;

public class VariableName {
	public static void main (String args[] )
	{
		// Java is strictly typed language  , It means that all variable must be declared before they can be used 
		// variable container identifier  , variable name 
		
		int speed ;
		speed = 20 ;
		System.out.println(speed);
		boolean flag = true ; 
		//Default value is false 
		System.out.print(flag);
		byte range = 127 ;
		//byte takes values from -128 to 127 , Default value is 0 8 bit signed 2 compliment integer 
		System.out.println(range);
		
		short number ; 
		number = 298; 
		// short  hold the values from -32768 to 32767 , default value is 0 16 bit singed 2 complement integer 
		System.out.println(number);
		
		int bigNumber  ;
		bigNumber = 1349889;
		// it can store upto -2^31 to 2^31 -1 
		System.out.print(bigNumber);
		
		long thisIsALongNumber ; 
		// it can store upto -2^63 to 2^63 -1 default 0 
		thisIsALongNumber= 200234234L;
		System.out.println();
		
		double thisIsADoubleNumber ; 
		// double precision 64 -bit floating point digit it should not be used for currency  
		thisIsADoubleNumber = 234234.234d;
		System.out.println(thisIsADoubleNumber);
		
		float numbers ; 
		numbers = 234f;
		System.out.println(numbers);
		//single precision 32 bit floating point number 
		
		//char is 16 bit unicode character  the minimum value of char ``\ u000` (0) and the maximum value is '\uffff'
		
		String java = " Java is a programing language";
		 
		
		
		
		
	}
}
