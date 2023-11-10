
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String input = scanner.nextLine();
            String[] word = input.split(" ");
            if (input.equals("")){
                return;
            }
            System.out.println(word[0]);            
        }
    }
}
