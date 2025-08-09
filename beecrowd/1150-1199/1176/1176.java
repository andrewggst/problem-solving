import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            if (n == 0){
                System.out.println("Fib(0) = 0");
            }else if (n == 1){
                System.out.println("Fib(1) = 1");
            }else {
                long fB = 0, fC = 1, f = 0;
                for (int j = 2; j <= n; j++){
                    f = fB + fC;
                    fB = fC;
                    fC = f;
                }
                System.out.println("Fib(" + n + ") = " + f);
            }
        }
    }
}