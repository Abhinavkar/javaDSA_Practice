package Day6_Pattern_Problem;

public class pyramid {
    public static void main(String[] args) {
        int n = 5 ;
        int star=1 ;
        int space = n-1;
        for (int row=0;row<n;row++){
            for (int space1 = 0 ;space1<space;space1++)
            {
                System.out.print(" ");
            }
            for(int star1 = 0;star1<star;star1++ ){
                System.out.print( "*" );
            }
            System.out.println();
            star+=2;
            space--;
        }
    }
}
