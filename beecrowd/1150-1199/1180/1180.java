import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] x = new int [n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int menor = x[0];
        int posicao = 0;
        for (int i = 1; i < n; i++) {
            if (x[i] < menor) {
                menor = x[i];
                posicao = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);
    }
}