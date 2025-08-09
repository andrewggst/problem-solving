import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int soma = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x > y){
               int temp = x;
                x = y;
                y = temp;
            }
            for (int j = x + 1; j < y; j++){
                if (j % 2 != 0){
                    soma += j;
                }
            }
            System.out.println(soma);
        }
    }
}