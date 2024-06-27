package Day4_Iterative;

public class Reverse4DigitNumber {
    public static void main(String[] args) {
        int n =1234 ;
        int rem = 0 ;
        int reversedNumber=0 ;
        while(n>0){
            rem=n%10;
            n=n/10;
            reversedNumber=reversedNumber*10+rem;


        }
        System.out.println(reversedNumber);
    }
}
