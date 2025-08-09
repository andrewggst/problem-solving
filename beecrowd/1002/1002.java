import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double PI = 3.14159;
        double r = sc.nextDouble();
        double a = (r * r) * PI;
        System.out.printf("A=%.4f\n", a);
    }
}