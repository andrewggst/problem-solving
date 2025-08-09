import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int numFunc = sc.nextInt();
        int horas = sc.nextInt();
        double valorHora = sc.nextDouble();
        double salario = valorHora * horas;
        System.out.println("NUMBER = " + numFunc);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}