
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        
        if (num < 0){
            int swap = num * -1;
            System.out.println(swap);
        } else {
            System.out.println(num);
        }
    }
}
