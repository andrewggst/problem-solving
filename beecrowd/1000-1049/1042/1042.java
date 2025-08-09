import java.io.IOException;
import java.util.Scanner; 
import java.util.Arrays;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] sorted = {a, b, c};
        Arrays.sort(sorted);
        System.out.println(sorted[0]);
        System.out.println(sorted[1]);
        System.out.println(sorted[2]);
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}