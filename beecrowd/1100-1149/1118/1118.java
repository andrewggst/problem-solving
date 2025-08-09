import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true){
            double soma = 0;
            int count = 0;
            while (count < 2){
                double n = sc.nextDouble();
                if (n < 0 || n > 10){
                    System.out.println("nota invalida");  
                }else {
                    soma += n;
                    count += 1;
                }
            }
            double nota = soma / 2;
            System.out.printf("media = %.2f\n", nota);
            int x = 0;
            while (x != 1 && x != 2){
                System.out.println("novo calculo (1-sim 2-nao)");
                x = sc.nextInt();
            }
            if (x == 2){
                break;
            }
        }
    }
}