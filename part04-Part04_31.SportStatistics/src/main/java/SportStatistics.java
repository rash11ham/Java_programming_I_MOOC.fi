
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        ArrayList<Game> teamDetails = getGameDetails(file);
        ArrayList<Game> chosenDetails = new ArrayList();
        
        int win = 0;
        for(Game game: teamDetails){
            if(game.getHomeTeam().equals(team)){
                chosenDetails.add(game);
            }
            if(game.getAwayTeam().equals(team)){
                chosenDetails.add(game);
            }
        }
        for(Game winGame: chosenDetails){
            if(winGame.checkWinner(team)){
                win++;
            }
        }
        System.out.println("Games: "+chosenDetails.size());
        System.out.println("Wins: "+win);
        System.out.println("Losses: "+(chosenDetails.size() - win));
        
        
    }
    public static ArrayList<Game> getGameDetails(String file){
        
        ArrayList<Game> gameDetails = new ArrayList();
        try (Scanner read = new Scanner(Paths.get(file))) {
            // we read all the lines of the file
            while (read.hasNextLine()) {
               String str = read.nextLine();
               String[] arr = str.split(",");
               String homeTeam  = arr[0];
               String awayTeam = arr[1];
               int homeScore = Integer.valueOf(arr[2]);
               int awayScore = Integer.valueOf(arr[3]);
               gameDetails.add(new Game(homeTeam,awayTeam,homeScore,awayScore));
            }
            
            
        } catch (Exception e) {
            System.out.println("Reading the file " +file+" failed.");
        }
        return gameDetails;
    }

}
