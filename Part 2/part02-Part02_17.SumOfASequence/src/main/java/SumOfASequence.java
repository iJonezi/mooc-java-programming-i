
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        for (int i = 0; i <= last; i++){
            sum = sum + i;
            if (i == last){
                System.out.println("The sum is " + sum);
            }
        }
    }
}
