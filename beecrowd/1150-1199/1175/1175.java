import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int [] n = new int [20];
        for (int i = 0; i < 20; i++){
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++){
            int temp = n[i];
            n[i] = n[19 - i];
            n[19 - i] = temp;
        }
        for (int i = 0; i < 20; i++){
            System.out.println("N[" + i + "] = " + n[i]);
        }
    }
}