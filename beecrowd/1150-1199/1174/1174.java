import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double [] a = new double [100];
        for (int i = 0; i < 100; i ++){
            a[i] = sc.nextDouble();
            if (a[i] <= 10){
                System.out.printf("A[%d] = %.1f%n", i, a[i]);
            }
        }
    }
}