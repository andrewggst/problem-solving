import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0, totalC = 0, totalR = 0, totalS = 0;
        for (int i = 0; i < n; i++){
            int qtd = sc.nextInt();
            String tipo = sc.next();
            total += qtd;
            if (tipo.equals("C")){
                totalC += qtd;
            }
            if (tipo.equals("R")){
                totalR += qtd;
            }
            if (tipo.equals("S")){
                totalS += qtd;
            }
        }
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + totalC);
        System.out.println("Total de ratos: " + totalR);
        System.out.println("Total de sapos: " + totalS);
        double percentC = (double) totalC * 100 / total;
        double percentR = (double) totalR * 100 / total;
        double percentS = (double) totalS * 100 / total;
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentC);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentR);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentS);
    }
}