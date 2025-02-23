
import java.util.Scanner;

public class AverageOfNumbers {

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
        double average = (1.0*sum/inputs);
   
        System.out.println("Average of the numbers: "+average);
        

    }
}
