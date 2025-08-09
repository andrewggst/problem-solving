import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        int horaI = sc.nextInt();
        int horaF = sc.nextInt();
        int duracao;
        if(horaI > horaF){
            duracao = (24 - horaI) + horaF;
        }else if(horaI < horaF){
            duracao = horaF - horaI;
        }else {
            duracao = 24;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}