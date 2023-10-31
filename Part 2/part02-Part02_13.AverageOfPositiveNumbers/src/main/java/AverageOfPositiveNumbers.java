
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int total = 0;
        
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input > 0){
                sum = sum + input;
                total = total + 1;
                continue;
            } else if (input == 0){
                break;
            }
        }
        if (sum <= 0){
            System.out.println("Cannot calculate the average");
        } else if (sum > 0){
            double avg = 1.0 * sum / total;
            System.out.println(avg);
        }
    }
}
