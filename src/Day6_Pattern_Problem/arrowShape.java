package Day6_Pattern_Problem;

public class arrowShape {
    public static void main(String[] args) {
        int n =7;
        int rows =n ;
        int stars =1 ;
        for (int row =1 ; row<=rows;row++){
            for (int star=1 ; star<=stars;star++){
                System.out.print(star);
            }
            System.out.println();
            if (row<=rows/2){
                stars++;
            }
            else {
                stars--;
            }

        }
        
    }
}
