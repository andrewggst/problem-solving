import java.io.IOException;
public class Main {
 
    public static void main(String[] args) throws IOException {
        double s = 1;
        for (int i = 2; i <= 100; i++){
            s = s + (1.0 / i);
        }
        System.out.printf("%.2f\n", s);
    }
}