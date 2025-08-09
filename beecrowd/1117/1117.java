import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double n = 0, nota = 0, count = 0; 
        while (true){
            n = sc.nextDouble();
            if (n < 0 || n > 10){
                System.out.println("nota invalida");
            }else {
                nota += n;
                count += 1;
            }
            if (count >= 2){
                break;
            }
        }
        System.out.printf("media = %.2f\n", nota / 2);
    }
}