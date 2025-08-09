import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        System.out.println(valor);
        int qtd100 = valor / 100;
        valor %= 100;
        int qtd50 = valor / 50;
        valor %= 50;
        int qtd20 = valor / 20;
        valor %= 20;
        int qtd10 = valor / 10;
        valor %= 10;
        int qtd5 = valor / 5;
        valor %= 5;
        int qtd2 = valor / 2;
        valor %= 2;
        int qtd1 = valor;
        System.out.printf("%d nota(s) de R$ 100,00\n", qtd100);
        System.out.printf("%d nota(s) de R$ 50,00\n", qtd50);
        System.out.printf("%d nota(s) de R$ 20,00\n", qtd20);
        System.out.printf("%d nota(s) de R$ 10,00\n", qtd10);
        System.out.printf("%d nota(s) de R$ 5,00\n", qtd5);
        System.out.printf("%d nota(s) de R$ 2,00\n", qtd2);
        System.out.printf("%d nota(s) de R$ 1,00\n", qtd1);
    }
}