import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fB = 0;
        int fC = 1;
        if (n == 1) {
            System.out.println("0");
        } else if (n == 2) {
            System.out.println("0 1");
        } else {
            System.out.print("0 1");
            for (int i = 2; i < n; i++) {
                int f = fB + fC;
                System.out.print(" " + f);
                fB = fC;
                fC = f;
            }
            System.out.println();
        }
    }
}