import java.util.Scanner;

public class Factorial {
    public static void main(String[ ] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int factorial = 1;

            for(int x = 1; x <= n; x++){
                factorial = factorial * x;
            }
            System.out.println(factorial);
        }
    }
}
