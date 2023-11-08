import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999){
                break;
            }
            numbers.add(input);
        }
        System.out.println("");
        
        int smallest = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++){
            int temp = numbers.get(i);
            if (smallest > temp){
                smallest = temp;
            }
        }
        System.out.println("Smallest number: " + smallest);
        int index = 0;
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) == smallest){
                index = i;
                System.out.println("Found at index: " + index);
            }
        }
        
    }
}
