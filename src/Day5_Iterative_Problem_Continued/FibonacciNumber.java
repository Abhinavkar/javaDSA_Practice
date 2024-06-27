package Day5_Iterative_Problem_Continued;

public class FibonacciNumber {
    public static void main(String[] args) {
        int firstNumber=0 ;
        int secondNumber=1 ;
        int n =6;
        //Fibonacci should print 8 ;

            for(int i =0;i<=n;i++){
                System.out.println(firstNumber);
                int thirdNumber=firstNumber+secondNumber;
                firstNumber=secondNumber;
                secondNumber=thirdNumber;

            }
    }
}
