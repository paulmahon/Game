import java.util.*; //for Scanner and Random classes

/**
* This is an application class that plays rock-paper-scissors with the 
* user.
*/
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in); //to get user input
        Random generator = new Random(); //to make random choices

        int humanWins = 0; //total times human won so far
        int computerWins = 0; //total times computer won so far
        do {
            //Show the scores so far
            System.out.println("Computer: "+computerWins+", Human: "+humanWins);
            System.out.println("Best " +(humanWins + 1)+ " out of " +
                (2*humanWins + 1));
            
            //prompt user for iniput
            System.out.println("Rock / Paper / Scissors?");
            
            //get input
            String choice = stdin.nextLine();
            GameChoice human = new GameChoice(choice);
            
            //generate random computer choice
            GameChoice computer;
            int c = generator.nextInt(3); //Produces a 0, 1, or 2
            if (c == 0) {
                computer = new GameChoice(GameChoice.ROCK);
            }
            else if (c == 1) {
                computer = new GameChoice(GameChoice.PAPER);
            }
            else {
                computer = new GameChoice(GameChoice.SCISSORS);
            }
            
            //print the result
            System.out.println("You had "+human);
            System.out.println("I had "+computer.toString());

            if (computer.beats(human)) {
                computerWins++;
                System.out.println("I win!!!!! :^D");
            }
            else if (computer.drawsAgainst(human)) {
                System.out.println("Draw!");
            }
            else {
                humanWins++;
                System.out.println("You win");
            }
            System.out.println();
        }
        while(humanWins >= computerWins);
        
        System.out.println("I am the champion!");
    }
}