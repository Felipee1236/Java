
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputs = 0;
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            if(num==0){
                break;
            }
            inputs = inputs+1;
            sum = sum+num;
                    
        } 
        System.out.println("Number of numbers: "+inputs);
        System.out.println("Sum of the numbers: "+sum);
    }
}
