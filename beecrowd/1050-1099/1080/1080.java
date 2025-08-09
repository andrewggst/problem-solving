import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[100];
        int maior = -1;
        int posicao = 0;
        for (int i = 0; i < 100; i++){
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < 100; i++){
            if (n[i] > maior){
                 maior = n[i];
                 posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao + 1);
    }
}