import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        for (int i = 0; i < n; i++){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            if (y == 0){
               System.out.println("divisao impossivel"); 
            }else {
                double div = x / y;
                System.out.printf("%.1f\n", div);
            }
        }
    }
}