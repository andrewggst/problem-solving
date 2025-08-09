import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int qtd = sc.nextInt();
        switch(codigo){
            case 1:
                System.out.printf("Total: R$ %.2f\n", qtd * 4.0);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n", qtd * 4.50);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f\n", qtd * 5.0);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n", qtd * 2.0);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f\n", qtd * 1.50);
                break;
        }
    }
}