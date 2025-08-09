import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int grenais = 0, inter = 0, gremio = 0, empate = 0;
        while (true){
            grenais += 1;
            int golI = sc.nextInt();
            int golG = sc.nextInt();
            if (golI > golG){
                inter += 1;
            }else if (golI < golG){
                gremio += 1;
            }else {
                empate += 1;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            int opc = sc.nextInt();
            if (opc == 2){
                System.out.println(grenais + " grenais");
                System.out.println("Inter:" + inter);
                System.out.println("Gremio:" + gremio);
                System.out.println("Empates:" + empate);
                if (inter > gremio){
                    System.out.println("Inter venceu mais");
                }else if (inter < gremio){
                    System.out.println("Gremio venceu mais");
                }else {
                    System.out.println("Nao houve vencedor");
                }
                break;
            }
        }
    }
}