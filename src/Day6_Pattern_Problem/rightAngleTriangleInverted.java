package Day6_Pattern_Problem;

public class rightAngleTriangleInverted {
    public static void main(String[] args) {
        int n =5 ;
        // Making a inverted right angle triangle
        for ( int i =n ; i>0;i--){
            for (int j = i ; j>0 ;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
