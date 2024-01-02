
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String cmd = parts[0];
            int amount = 0;
            if ((Integer.valueOf(parts[1])) >= 0){
                amount = Integer.valueOf(parts[1]);
            }
            
            if (cmd.equals("add")){
                if ((first + amount) <= 100){
                    first+= amount;
                } else if ((first + amount) > 100){
                    first = 100;
                }
            }
            
            if (cmd.equals("move")){
                if ((amount >= first) && ((second + first) <= 100)){
                    second+= first;
                    first-= first;
                } else if ((amount <= first) && ((second + first) <= 100)){
                    first-= amount;
                    second+= amount;
                } else if ((amount >= first) && ((second + first) > 100)){
                    first = 0;
                    second = 100;
                } else if ((amount <= first) && ((second + first) > 100)){
                    int newamt = first - amount;
                    first-= newamt;
                    second = 100;
                }
            }
            
            if (cmd.equals("remove")){
                if (amount >= second){
                    second = 0;
                } else if (amount <= second){
                    second-= amount;
                }
            }
        }
    }

}
