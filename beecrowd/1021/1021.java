import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        int valor = (int)(input * 100 + 0.5);
        int qtd100 = valor / 10000;
        valor %= 10000;
        int qtd50 = valor / 5000;
        valor %= 5000;
        int qtd20 = valor / 2000;
        valor %= 2000;
        int qtd10 = valor / 1000;
        valor %= 1000;
        int qtd5 = valor / 500;
        valor %= 500;
        int qtd2 = valor / 200;
        valor %= 200;
        int qtd1 = valor / 100;
        valor %= 100;
        int qtd05 = valor / 50;
        valor %= 50;
        int qtd025 = valor / 25;
        valor %= 25;
        int qtd010 = valor / 10;
        valor %= 10;
        int qtd005 = valor / 5;
        valor %= 5;
        int qtd001 = valor;
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", qtd100);
        System.out.printf("%d nota(s) de R$ 50.00\n", qtd50);
        System.out.printf("%d nota(s) de R$ 20.00\n", qtd20);
        System.out.printf("%d nota(s) de R$ 10.00\n", qtd10);
        System.out.printf("%d nota(s) de R$ 5.00\n", qtd5);
        System.out.printf("%d nota(s) de R$ 2.00\n", qtd2);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", qtd1);
        System.out.printf("%d moeda(s) de R$ 0.50\n", qtd05);
        System.out.printf("%d moeda(s) de R$ 0.25\n", qtd025);
        System.out.printf("%d moeda(s) de R$ 0.10\n", qtd010);
        System.out.printf("%d moeda(s) de R$ 0.05\n", qtd005);
        System.out.printf("%d moeda(s) de R$ 0.01\n", qtd001);
    }
}