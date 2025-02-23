import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputs = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a num:");
            int num = Integer.valueOf(scanner.nextLine());

            if (inputs == 0 && num <= 0) {
                System.out.println("Cannot calculate the average");
            }

            if (num == 0) {
                break;
            }

            if (inputs >= 0 && num > 0) {
                inputs = inputs + 1;
                sum = sum + num;
            }
        }

        double average = (sum * 1.0) / inputs;
        System.out.println("Average of the numbers: " + average);

    }
}