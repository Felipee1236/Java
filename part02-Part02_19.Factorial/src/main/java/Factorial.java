
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int second = scanner.nextInt();
        int multi = 1;
        for(int i = 1; i <= second; i++){
            multi *=i;
        }
        
        System.out.println("Factorial: "+multi);

    }
}
