import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int pA = sc.nextInt();
            int pB = sc.nextInt();
            double gA = (sc.nextDouble()) / 100;
            double gB = (sc.nextDouble()) / 100;
            int count = 0;
            while (pA <= pB){
                pA += (int)(pA * gA);
                pB += (int)(pB * gB);
                count ++;
                if (count > 100){
                    break;
                }
            }
            if (count <= 100){
                System.out.println(count + " anos.");
            }else {
                System.out.println("Mais de 1 seculo.");
            }
        }
    }
}