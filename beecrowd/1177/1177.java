import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int [] n = new int [1000];
        int count = 0, t = sc.nextInt();
        for (int i = 0; i < 1000; i++){
            n[i] = count;
            count ++;
            if (count == t){
                count = 0;
            }
            System.out.println("N[" + i + "] = " + n[i]);
        }
    }
}