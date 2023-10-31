
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        
        // Set string variable
        String message = scanner.nextLine();
        
        // Print lines
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }
}
