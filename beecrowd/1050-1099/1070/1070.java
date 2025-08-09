import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        while (count < 6) {
            if (x % 2 != 0) {
                System.out.println(x);
                count++;
            }
            x++;
        }
    }
}