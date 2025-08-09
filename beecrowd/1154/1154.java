import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int soma = 0, count = 0;
        while (true){
            int i = sc.nextInt();
            if (i < 0){
                break;
            } else{
                soma += i;
                count ++;
            }
        }
        double media = (double) soma / count;
        System.out.printf("%.2f\n", media);
    }
}