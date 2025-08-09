import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int alcool = 0, gasolina = 0, diesel = 0;
        while (true){
            int n = sc.nextInt();
            switch (n){
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                default:
                    break;
            }
            if (n == 4){
                System.out.println("MUITO OBRIGADO");
                System.out.println("Alcool: " + alcool);
                System.out.println("Gasolina: " + gasolina);
                System.out.println("Diesel: " + diesel);
                break;
            }
        }
    }
}