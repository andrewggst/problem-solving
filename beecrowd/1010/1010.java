import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int codigo1 = sc.nextInt();
        int qtd1 = sc.nextInt();
        double valorUnit1 = sc.nextDouble();
        int codigo2 = sc.nextInt();
        int qtd2 = sc.nextInt();
        double valorUnit2 = sc.nextDouble();
        double valorTotal = qtd1 * valorUnit1 + qtd2 * valorUnit2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
    }
}