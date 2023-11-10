
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] user = {"alex", "emma"};
        String[] pass = {"sunshine", "haskell"};
        
        System.out.println("Enter username: ");
        String inputUser = scanner.nextLine();
        System.out.println("Enter password:");
        String inputPass = scanner.nextLine();
        
        if (inputUser.equals(user[0]) && inputPass.equals(pass[0])){
            System.out.println("You have successfully logged in!");
        } else if (inputUser.equals(user[1]) && inputPass.equals(pass[1])){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
