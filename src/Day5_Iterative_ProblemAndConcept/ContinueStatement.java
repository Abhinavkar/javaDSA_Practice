package Day5_Iterative_ProblemAndConcept;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if(i>4&&i<9)
                continue;
            System.out.println(i);
        }
    }
}
