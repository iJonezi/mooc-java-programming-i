
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))){
            while (true){
                if (reader.hasNextLine()){
                    String data = reader.nextLine();
                    String[] values = data.split(",");
                    String name = values[0];
                    int age = Integer.valueOf(values[1]);
                    persons.add(new Person(name, age));
                } else {
                    break;
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + file + " contains no records.");
        }
        return persons;

    }
}
