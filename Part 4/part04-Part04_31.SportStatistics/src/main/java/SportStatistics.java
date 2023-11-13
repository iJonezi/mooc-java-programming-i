
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File: ");
        String file = scanner.nextLine();
        System.out.println("Team: ");
        String team = scanner.nextLine();
        
        int gameCount = 0;
        int teamWins = 0;
        int teamLosses = 0;
        
        try (Scanner reader = new Scanner(Paths.get(file))){
            while (reader.hasNextLine()){
                    String line = reader.nextLine();
                    String[] data = line.split(",");
                    
                    String teamOne = data[0];
                    String teamTwo = data[1];
                    int oneScore = Integer.valueOf(data[2]);
                    int twoScore = Integer.valueOf(data[3]);
                    
                    if (teamOne.equals(team) || teamTwo.equals(team)){
                        gameCount++;
                    }
                    if (data[0].equals(team) && oneScore > twoScore){
                        teamWins++;
                    } else if (data[1].equals(team) && twoScore > oneScore){
                        teamWins++;
                    }
                    
                    teamLosses = gameCount - teamWins;
                }
            System.out.println("Games: " + gameCount);
            System.out.println("Wins: " + teamWins);
            System.out.println("Losses: " + teamLosses);
            
        } catch (Exception e){
            System.out.println("Error: " + file + " was not found.");
        }

    }
}
