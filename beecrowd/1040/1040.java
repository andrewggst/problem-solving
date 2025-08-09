import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        media = Math.floor(media * 10) / 10.0;
        System.out.printf("Media: %.1f\n", media);
        if(media >= 7){
            System.out.println("Aluno aprovado.");
        }else if(media < 5){
            System.out.println("Aluno reprovado.");
        }
        if(media >= 5 && media < 7) {
            System.out.println("Aluno em exame.");
            double nE = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", nE);
            double mediaFinal = (media + nE) / 2;
            mediaFinal = Math.floor(mediaFinal * 10) / 10.0;
            if(mediaFinal >= 5){
                System.out.println("Aluno aprovado.");
            }else if(mediaFinal < 5){
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", mediaFinal);
        }
    }
}