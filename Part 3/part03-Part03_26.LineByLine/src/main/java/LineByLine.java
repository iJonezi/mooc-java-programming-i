
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String story = scanner.nextLine();
            String[] pieces = story.split(" ");
        
            if (story.equals("")){
                return;
            } else {
                for (int i = 0; i < pieces.length; i++){
                    System.out.println(pieces[i]);
                }
            }
        }
    }
}
