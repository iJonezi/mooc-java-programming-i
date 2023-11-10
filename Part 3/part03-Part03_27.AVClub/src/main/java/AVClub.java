
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String input = scanner.nextLine();
            String[] word = input.split(" ");
            
            if (input.equals("")){
                return;
            }
            for (int i = 0; i < word.length; i++){
                if (word[i].contains("av")){
                    System.out.println(word[i]);
                } else;
                continue;
            }
        }
    }
}
