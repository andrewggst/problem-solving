import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int i = 1;
        int jI = 7;
        while (i <= 9){
            int j = jI;
            int n = 0;
            while (n < 3){
                System.out.println("I=" + i + " J=" + j);
                j -= 1;
                n += 1;
            }
            i += 2;
            jI += 2;
        }
    }
}