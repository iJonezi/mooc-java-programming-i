
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int nums = 0;
        while (true){
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input != 0){
                sum = sum + input;
                nums = nums + 1;
                continue;
            } else {
                break;
            }
        }
        System.out.println("Number of numbers: " + nums);
        System.out.println("Sum of the numbers: " + sum);
    }
}
