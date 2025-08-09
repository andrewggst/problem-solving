import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int tempo = sc.nextInt();
        int velMedia = sc.nextInt();
        double combustivel = (velMedia * tempo) / 12.0;
        System.out.printf("%.3f\n", combustivel);
    }
}