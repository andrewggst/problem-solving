import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double [] n = new double [100];
        double x = sc.nextDouble();
        for (int i = 0; i < 100; i++){
            n[i] = x;
            x /= 2;
            System.out.printf("N[%d] = %.4f\n", i, n[i]);
        }
    }
}