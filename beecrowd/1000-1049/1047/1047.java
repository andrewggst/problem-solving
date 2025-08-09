import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        int horaI = sc.nextInt();
        int minI = sc.nextInt();
        int horaF = sc.nextInt();
        int minF = sc.nextInt();
        int duracaoH, duracaoM;
        if(horaI > horaF){
            duracaoH = (24 - horaI) + horaF;
        }else if(horaI < horaF){
            duracaoH = horaF - horaI;
        }else {
            duracaoH = 0;
        }
        duracaoM = minF - minI;
        if (duracaoM < 0) {
            duracaoM += 60;
            duracaoH -= 1;
        }
        if (duracaoH < 0) {
            duracaoH += 24;
        }
        if (duracaoH == 0 && duracaoM == 0) {
            duracaoH = 24;
        }
        System.out.println("O JOGO DUROU " + duracaoH + " HORA(S) E " + duracaoM + " MINUTO(S)");
    }
}