import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true){
            int x = sc.nextInt();
            if (x == 0){
                break;
            }
            if (x % 2 != 0){
                x ++;
            }
            int soma = 0;
            for (int i = 0; i < 5; i++){
                soma += x;
                x += 2;
            }
            System.out.println(soma);
        }
    }
}