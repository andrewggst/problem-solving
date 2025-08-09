import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int i = 1;
        int j = 60;
        System.out.print("I=" + i + " ");
        System.out.println("J=" + j);
        while (j != 0){
            i += 3;
            j -= 5;
            System.out.print("I=" + i + " ");
            System.out.println("J=" + j);
        }
    }
}