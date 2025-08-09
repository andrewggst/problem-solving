import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int somaImpar = 0;
        int x = sc.nextInt();
        int y = sc.nextInt();
           if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        for (int i = x + 1; i < y; i++){
            if (i % 2 != 0){
                somaImpar += i;
            }
        }
        System.out.println(somaImpar);
    }
}