import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.next();
        int diaI = sc.nextInt();
        int horaI = sc.nextInt();
        sc.next();
        int minutoI = sc.nextInt();
        sc.next();
        int segundoI = sc.nextInt();
        sc.next();
        int diaF = sc.nextInt();
        int horaF = sc.nextInt();
        sc.next();
        int minutoF = sc.nextInt();
        sc.next();
        int segundoF = sc.nextInt();
        int segundosTotalI = segundoI + minutoI * 60 + horaI * 3600 + diaI * 86400;
        int segundosTotalF = segundoF + minutoF * 60 + horaF * 3600 + diaF * 86400;

        int duracaoTotal = segundosTotalF - segundosTotalI;

        int dias = duracaoTotal / 86400;
        duracaoTotal %= 86400;
        int horas = duracaoTotal / 3600;
        duracaoTotal %= 3600;
        int minutos = duracaoTotal / 60;
        int segundos = duracaoTotal % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
}