import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > y){
            int temp = x;
            x = y;
            y = temp;
        }
        for (int i = x; i <= y; i++){
            if (i % 13 != 0){
                soma += i;
            }
        }
        System.out.println(soma);
    }
}