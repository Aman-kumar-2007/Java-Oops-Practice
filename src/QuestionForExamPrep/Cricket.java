package QuestionForExamPrep;
/*
Cricket Tournament System

Store names and runs scored by 5 players using an array of objects.

Display:


All player details
Highest scorer
Average runs

 */
class Player{
    String playerName;
    int runs;

    Player(String name,int run){
        this.playerName = name;
        this.runs = run;
    }
}
public class Cricket {
    public static void main(String[] args){

        Player[] players = new Player[5];

        players[0] = new Player("Virat", 85);
        players[1] = new Player("Rohit", 120);
        players[2] = new Player("Gill", 75);
        players[3] = new Player("Hardik", 95);
        players[4] = new Player("Rahul", 60);

        System.out.println("Player Details");

        Player highest =  players[0]; // data Type player hai
        int totalRuns = 0;
        for(Player p : players){
            System.out.println("Player Name : " + p.playerName + " \nruns : " + p.runs);
            totalRuns += p.runs;

            if(p.runs > highest.runs) {
                highest = p;
            }

        }

        double average = (double) totalRuns / players.length;

        System.out.println("Highest Scorer : " + highest.playerName + " -> " + highest.runs);

        System.out.println("Average Runs : " + average);


    }
}
