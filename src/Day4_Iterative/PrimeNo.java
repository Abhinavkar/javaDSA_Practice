package Day4_Iterative;
import java.util.*;
import java.math.*;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 5 ;
        byte flag=0 ;
        for(int i =2;i<=Math.sqrt(n);i++) {
            if (n % i == 0) {
                flag++;
                break;
            }
        }
        if(flag==1) {
            System.out.println("Not a Prime Number");
        }
        else
            System.out.println("Prime Number");

    }
}
