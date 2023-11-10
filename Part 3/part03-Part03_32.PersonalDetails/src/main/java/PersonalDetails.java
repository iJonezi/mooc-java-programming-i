
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        while (true){
            String input = scanner.nextLine();
            String[] word = input.split(",");
            
            if (input.equals("")){
                break;
            }
            name.add(word[0]);
            age.add(Integer.valueOf(word[1]));
        }

        // Finding longest name
        int length = 0;
        String longest = "";
        for (int i = 0; i < name.size(); i++){
            int nameLength = name.get(i).length(); 
            if (nameLength > length){
                length = nameLength;
                longest = name.get(i);
            }
        }
        // Calculating age averages
        int ageSum = 0;
        for (int i = 0; i < age.size(); i++){
            int year = age.get(i);
            ageSum = ageSum + year;
        }
        double ageAvg = 0.0;
        ageAvg = 1.0 * ageSum / age.size();
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + ageAvg);
    }
}
