import java.util.Random;
import java.util.Scanner;

public class RockPaperSciccorPaul {
	private int wins = 0;
	private int losses = 0;
	private    int pclosses = 0;
	private    int games;
	private    int rnd;
	private    int lives = 3;
	private    int gameStats[][];
	private    int userShape[];
	private    int pcShape[];
	private userShape = new int[100];
	private    pcShape = new int[100];
    private int n = 0;
public static void main(String[] args){

   // String Shapes[] = {"Rock","Paper","Scissors"};


//Ask the the user for input a value fo rthe number of games required
	Scanner input = new Scanner (System.in);

	System.out.println("How many games do you want to play?");
		int numGames = input.nextInt();

		int arrnumGames[] = new int[numGames];

		gameStats = new int [n][4];


    // Play game while user still has lives left
    int livesLeft=0;
    for (int i = 0; i < lives; i++){
		livesLeft = lives - losses;


    for(games=numGames;games>=1;games--){
            //Display's games left on the right side
        System.out.println("\t\t\t\t\t 1 = Rock\n\t\t\t\t\t 2 = Paper\n\t\t\t\t\t 3 = Scissor");
        System.out.println("\t\t\t\t\t ~~~~~~~~~~~~~~");
        System.out.println("\t\t\t\t\t|Games Left:" + (games) + "|");
        System.out.println("\t\t\t\t\t|Lives Left:" + (livesLeft) + "|");

        System.out.println("\t\t\t\t\t ~~~~~~~~~~~~~~");

    Random GAME = new Random();
    int PC = 1+GAME.nextInt(3);

    //Scanner input = new Scanner (System.in);
    int SCISSOR, ROCK, PAPER;
    ROCK = 1;
    PAPER = 2;
    SCISSOR= 3;

    int USER =  input.nextInt();

    //If the user enters a value greater then 3 or less than 1 it will terminate the prgm
    //and display an error msg
   // while (USER > 3 || USER < 1) {
   //     System.err.println("Incorrect value entered. Restart the Game\nand choose a number 1-3");
   //     return;
   //     }
   // System.out.println("___________________");

    if(USER == PC){
        if(USER == SCISSOR){
            System.out.println("You Both Played Scissor");
        }
        if(USER == ROCK){
            System.out.println("You Both Played Rock");
        }
        if(USER == PAPER){
            System.out.println("You Both Played Paper");
        }
        System.out.println("Draw");
        System.out.println("|~~~~~~~~~~~~~~~~~~|");
        System.out.println(" Wins: " + wins + "|Losses: " + losses);
        System.out.println("|~~~~~~~~~~~~~~~~~~|");
    }
    //User wins
    if(USER == SCISSOR)
        if(PC == PAPER){
        System.out.println("You: Scissor\nPC: Paper");
        System.out.println("Scissor Cuts Paper");
        System.out.println("You Win!");
        wins++;
        System.out.println("|~~~~~~~~~~~~~~~~~~|");
        System.out.println(" Wins: " + wins + "|Losses: " + pclosses);
        System.out.println("|~~~~~~~~~~~~~~~~~~|");
    }
    //Pc wins
    else if(PC == ROCK){
        System.out.println("You: Scissor \nPC: Rock");
        System.out.println("Rock Breaks Scissor!");
        System.out.println("PC Wins!");
        losses++;
        System.out.println("|~~~~~~~~~~~~~~~~~~|");
        System.out.println(" Wins: " + wins + "|Losses: " + losses);
        System.out.println("|~~~~~~~~~~~~~~~~~~|");
    }
    //User wins
    if(USER == ROCK)
        if(PC == SCISSOR ){
        System.out.println("You: Rock\nPC: Scissor");
        System.out.println("Rock Breaks Scissor");
        System.out.println("You Win! ");
        wins++;
        System.out.println("|~~~~~~~~~~~~~~~~~~|");
        System.out.println(" Wins: " + wins + "|Losses: " + pclosses);
        System.out.println("|~~~~~~~~~~~~~~~~~~|");
    }
    //Pc wins
    else if (PC == PAPER){
        System.out.println("You: Rock\nPC: Paper");
        System.out.println("Paper Covers Rock!");
        System.out.println("PC Wins!");
        losses++;
        System.out.println("|~~~~~~~~~~~~~~~~~~|");
        System.out.println(" Wins: " + wins + "|Losses: " + losses);
        System.out.println("|~~~~~~~~~~~~~~~~~~|");
    }
    //User Wins
    if(USER == PAPER)
        if(PC == ROCK){
        System.out.println("You: Paper\nPC: Rock");
        System.out.println("Paper Covers Rock");
        System.out.println("You Win!");
        wins++;
        System.out.println("|~~~~~~~~~~~~~~~~~~|");
        System.out.println(" Wins: " + wins + "|Losses: " + pclosses);
        System.out.println("|~~~~~~~~~~~~~~~~~~|");
    }
    // Pc Wins
    else if (PC == SCISSOR){
        System.out.println("You: Paper\nPC: Scissor");
        System.out.println("Scissor Cuts Paper!");
        System.out.println("PC Wins!");
        losses++;
        System.out.println("|~~~~~~~~~~~~~~~~~~|");
        System.out.println(" Wins: " + wins + "|Losses: " + losses);
        System.out.println("|~~~~~~~~~~~~~~~~~~|");
        }
        if(games==1){
        System.out.println("\t\t\t\t\t" +
                "(Game Over man, Game Over!)");
        }
    }
}

}
}