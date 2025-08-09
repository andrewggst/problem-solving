import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 0; i < n; i++){
            System.out.print(count + " ");
            System.out.print((count * count) + " ");
            System.out.println(count * count * count);
            count ++;
        }
    }
}