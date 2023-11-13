
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("First name: ");
            String first = scanner.nextLine();
            if (first.isEmpty()){
                break;
            }
            
            System.out.println("Last name: ");
            String last = scanner.nextLine();
            
            System.out.println("Identification Number: ");
            String id = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(first, last, id));
            
        }
        for (PersonalInformation info: infoCollection ){
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }

    }
}
