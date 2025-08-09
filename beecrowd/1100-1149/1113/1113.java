import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = 1, y = 1;
        while (true){
            x = sc.nextInt();
            y = sc.nextInt();
            if (x == y){
                break;
            }else {
                if (x > y){
                    System.out.println("Decrescente");
                }else {
                    System.out.println("Crescente");
                }
            }
        }
    }
}