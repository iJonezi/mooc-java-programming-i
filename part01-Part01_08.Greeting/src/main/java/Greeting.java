
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Print question
        System.out.println("What's your name?");
        
        // store string
        String name = scanner.nextLine();
        
        System.out.println("Hi " + name);
    }
}
