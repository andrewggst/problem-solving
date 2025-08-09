import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
       for (int i = 0; i <= 10; i++) {
            double I = i * 0.2;
            for (int j = 1; j <= 3; j++) {
                double J = j + I;
                if (i % 5 == 0) {
                    System.out.printf("I=%d J=%d\n", (int) I, (int) J);
                } else {
                    System.out.printf("I=%.1f J=%.1f\n", I, J);
                }
            }
        }
    }
}