import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = 0;
        while (true) {
            n = sc.nextInt();
            if (n > 0) {
                break;
            }
        }
        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += (a + i);
        }
        System.out.println(soma);
    }
}