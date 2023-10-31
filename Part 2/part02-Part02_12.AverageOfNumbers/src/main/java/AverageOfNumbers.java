
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int sum = 0;
        
        while (true){
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input != 0){
                sum = sum + input;
                total = total + 1;
                continue;
            } else {
                break;
            }
        }
        
        double avg = 1.0 * sum / total;
        System.out.println("Average of the numbers: " + avg);
    }
}
