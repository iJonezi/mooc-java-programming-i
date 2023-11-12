
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        Statistics userInput = new Statistics();
        Statistics userInputEven = new Statistics();
        Statistics userInputOdd = new Statistics();
        
        while (true){
            int input = Integer.valueOf(scanner.next());
            if (input == -1){
                break;
            }
            userInput.addNumber(input);
            
            if (input % 2 != 0){
                userInputOdd.addNumber(input);
            } else if (input %2 == 0){
                userInputEven.addNumber(input);
            }
        }
        System.out.println("Sum: " + userInput.sum());
        System.out.println("Sum of even numbers: " + userInputEven.sum());
        System.out.println("Sum of odd numbers: " + userInputOdd.sum());
        
    }
}
