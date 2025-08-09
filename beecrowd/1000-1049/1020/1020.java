import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        int qtdA = idade / 365;
        idade %= 365;
        int qtdM = idade / 30;
        idade %= 30;
        int qtdD = idade;
        System.out.printf("%d ano(s)\n", qtdA);
        System.out.printf("%d mes(es)\n", qtdM);
        System.out.printf("%d dia(s)\n", qtdD);
    }
}