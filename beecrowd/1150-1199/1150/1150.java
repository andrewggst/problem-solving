import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z = sc.nextInt();
        while (z <= x){
            z = sc.nextInt();
        }
        int soma = 0;
        int count = 0;
        for (int i = x; soma <= z; i++){
            soma += i;
            count ++;
            if (soma > z){
                break;
            }
        }
        System.out.println(count);
    }
}