import java.io.IOException;
import java.util.Scanner; 
import java.util.Arrays;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double[] lados = {a, b, c};
        Arrays.sort(lados);
        a = lados[2];
        b = lados[1];
        c = lados[0];
        if(a >= (b +c)){
            System.out.println("NAO FORMA TRIANGULO");
        }else {
            if((a * a) == (b * b) + (c * c)){
                System.out.println("TRIANGULO RETANGULO");
            } 
            if((a * a) > (b * b) + (c * c)){
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if((a * a) < (b * b) + (c * c)){
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if(a == b && b == c){
                System.out.println("TRIANGULO EQUILATERO");
            }else if(a == b || b == c || c == a){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}