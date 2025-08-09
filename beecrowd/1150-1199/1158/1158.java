import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x % 2 == 0){
                x ++;
            }
            int soma = 0;
            for (int j = 0; j < y; j++) {
                soma += x;
                x += 2;
            }
            System.out.println(soma);
        }
    }
}