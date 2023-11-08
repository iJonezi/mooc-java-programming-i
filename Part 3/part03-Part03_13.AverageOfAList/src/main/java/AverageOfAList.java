
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            list.add(input);
        }
        System.out.println("");
        int total = 0;
        for (Integer add: list){
            total = add + total;
        }
        double avg = 1.0 * total / list.size();
        
        System.out.println("Average: " + avg);
    }
}
