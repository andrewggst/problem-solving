import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int x = sc.nextInt();
        int y = sc.nextInt();
        while (count <= y) {
            int i = 0;
            while (i < x && count <= y) {
                System.out.print(count);
                if (i < x - 1 && count < y) {
                    System.out.print(" ");
                }
                count++;
                i++;
            }
            System.out.println();
        }
    }
}