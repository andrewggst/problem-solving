import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] par = new int[5], impar = new int[5];
        int j = 0, k = 0;
        for (int i = 0; i < 15; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                par[j] = n;
                j++;
                if (j == 5) {
                    for (int a = 0; a < 5; a++) {
                        System.out.println("par[" + a + "] = " + par[a]);
                    }
                    j = 0;
                }
            } else {
                impar[k] = n;
                k++;
                if (k == 5) {
                    for (int a = 0; a < 5; a++) {
                        System.out.println("impar[" + a + "] = " + impar[a]);
                    }
                    k = 0;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println("impar[" + i + "] = " + impar[i]);
        }
        for (int i = 0; i < j; i++) {
            System.out.println("par[" + i + "] = " + par[i]);
        }
    }
}