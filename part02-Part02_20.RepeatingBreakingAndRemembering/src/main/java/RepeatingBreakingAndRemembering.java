
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int inputs = 0;
        int evenNums = 0;
        int oddNums = 0;
        while(true){
            System.out.println("Give numbers:");
            int num = scanner.nextInt();
            if(num == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            if(num%2==0){
                evenNums++;
            }else{
                oddNums++;
            }
            sum += num;
            inputs++;
            
        }
        System.out.println("sum: "+sum);
        System.out.println("Numbers: "+inputs);
        System.out.println("Average:"+(sum*1.0/inputs));
        System.out.println("Even: "+evenNums);
        System.out.println("Odd: "+oddNums);
        

    }
}
