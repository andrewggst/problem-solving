import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            double x1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            System.out.printf("%.1f\n", (x1 * 2)/10 + (x2 * 3)/10 + (x3 * 5)/10);
        }
    }
}