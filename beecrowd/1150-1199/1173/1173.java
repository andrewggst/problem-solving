import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int [] n = new int [10];
        int x = sc.nextInt();
        n[0] = x;
        for (int i = 1; i < 10; i++){
            n[i] = n[i-1] * 2;
        }
        for (int i = 0; i < 10; i++){
            System.out.println("N[" + i + "] = " + n[i]);
        }
    }
}