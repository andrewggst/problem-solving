import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        if (salario > 2000){
            System.out.printf("Novo salario: %.2f\n", salario + ((salario * 4) / 100));
            System.out.printf("Reajuste ganho: %.2f\n", (salario * 4) / 100);
            System.out.println("Em percentual: 4 %" );
        }else if (salario > 1200 && salario <= 2000){
            System.out.printf("Novo salario: %.2f\n", salario + ((salario * 7) / 100));
            System.out.printf("Reajuste ganho: %.2f\n", (salario * 7) / 100);
            System.out.println("Em percentual: 7 %" );
        }else if (salario > 800 && salario <= 1200){
            System.out.printf("Novo salario: %.2f\n", salario + ((salario * 10) / 100));
            System.out.printf("Reajuste ganho: %.2f\n", (salario * 10) / 100);
            System.out.println("Em percentual: 10 %" );
        }else if (salario > 400 && salario <= 800){
            System.out.printf("Novo salario: %.2f\n", salario + ((salario * 12) / 100));
            System.out.printf("Reajuste ganho: %.2f\n", (salario * 12) / 100);
            System.out.println("Em percentual: 12 %" );
        }else {
            System.out.printf("Novo salario: %.2f\n", salario + ((salario * 15) / 100));
            System.out.printf("Reajuste ganho: %.2f\n", (salario * 15) / 100);
            System.out.println("Em percentual: 15 %" );
        }
    }
}