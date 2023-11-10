
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        while (true){
            String input = scanner.nextLine();
            String[] word = input.split(",");
            
            if (input.equals("")){
                break;
            }
            
            for (int i = 0; i < word.length; i++){
                if (Integer.valueOf(word[1]) > oldest){
                    oldest = Integer.valueOf(word[1]);
                }
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
