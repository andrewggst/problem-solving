import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double[][] m = new double[12][12];
        double soma = 0.0;
        String t = sc.next();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                m[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < i; j++) {
                soma += m[i][j];
            }
        }
        if (t.equals("S")) {
            System.out.printf("%.1f\n", soma);
        } else {
            System.out.printf("%.1f\n", soma / 66.0);
        }
        sc.close();
    }
}
