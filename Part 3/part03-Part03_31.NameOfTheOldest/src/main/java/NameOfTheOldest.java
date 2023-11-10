
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String old = "";
        while (true){
            String input = scanner.nextLine();
            String[] word = input.split(",");
            
            if (input.equals("")){
                break;
            }
            
            for(int i = 0; i < word.length; i++){
                if (Integer.valueOf(word[1]) > oldest){
                    oldest = Integer.valueOf(word[1]);
                    old = word[0];
                }
            }
        }
        System.out.println("Name of the oldest: " + old);
    }
}
