import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int senha = 0;
        while (true){
            senha = sc.nextInt();
            if (senha == 2002){
                System.out.println("Acesso Permitido");
                break;
            }else {
                System.out.println("Senha Invalida");
            }
        }
    }
}