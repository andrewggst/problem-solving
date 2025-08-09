import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = 0, countIn = 0, countOut = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            x = sc.nextInt();
            if (x >= 10 && x <= 20){
                countIn ++;
            }else{
                countOut ++;
            }
        }
        System.out.println(countIn + " in");
        System.out.println(countOut + " out");
    }
}