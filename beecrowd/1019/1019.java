import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int qtdH = n / 3600;
        n %= 3600;
        int qtdM = n / 60;
        n %= 60;
        int qtdS = n;
        System.out.printf("%d:%d:%d\n", qtdH, qtdM, qtdS);
    }
}