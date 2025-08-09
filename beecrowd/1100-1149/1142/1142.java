import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int m = 0;
            while (m != 3){
                System.out.print(count + " ");
                count ++;
                m ++;
            }
            System.out.println("PUM");
            count ++;
        }
    }
}