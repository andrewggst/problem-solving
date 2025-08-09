import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            if (m <= 0 || n <= 0) {
                break;
            }
            if (m > n){
                int temp = m;
                m = n;
                n = temp;
            }
            if (m > 0 && n > 0){
                int soma = 0;
                for (int i = m; i <= n; i++){
                    System.out.print(i + " ");
                    soma += i;
                }
                System.out.println("Sum=" + soma);
            }
        }
    }
}