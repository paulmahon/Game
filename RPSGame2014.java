/*
 *	RPSGame2014.java - Rock Paper Scissors Game
 *  Instantiable Class
 *	@author Paul Mahon
 *	Student ID: 14119145
 *	20/11/14
 */

import java.util.Random;
import java.util.Scanner;

public class RPSGame2014 {
	private int wins = 0;
	private int losses = 0;
	private int games;
	private int shapeChoices [][];
	private int livesLeft = 3;
	private int userShape = 0;
	private int ROCK=1;
    private int PAPER=2;
    private int SCISSOR=3;
    private int Computer;
	private Scanner	input = new Scanner (System.in);

		public void RPSGame2014(){

			shapeChoices = new int [games][2]; //create a 2D array where the number of games choosen by the user is the rows and the columns contain choices for User & Computer


		}

			public void captureGames(){
				System.out.println("How many games do you want to play?");
				games = input.nextInt();
		}

			public void getUserShape(){
			System.out.println();
			System.out.println();
			System.out.println("Please choose the number of you shape:");
			System.out.println();
			System.out.println("	Rock 	 = 1");
			System.out.println("	Paper 	 = 2"				+" 			No. Games Remaining: " + games);
			System.out.println("	Scissors = 3");

			//Take input from the users choice of shape
			userShape = input.nextInt();
		}

		public void calculateWinner(){

			//the below code will calculate if the game was a draw
			if(userShape == Computer){
	       		 	if(userShape == SCISSOR){
					System.out.println("You Both Played Scissor");
					}
						if(userShape == ROCK){
						System.out.println("You Both Played Rock");
						}
							if(userShape == PAPER){
							System.out.println("You Both Played Paper");
							}

				System.out.println("Result is a Draw\n");
				System.out.println("	|		Wins: " + wins + "|		Losses: " + losses);
	        	System.out.println("	|-----------------------------------------------------------|");
	    	}

	    //User wins
	    if(userShape == SCISSOR)
	        if(Computer == PAPER){
	        System.out.println("User: Scissor\nComputer: Paper");
	        System.out.println("Scissor beats Paper");
	        System.out.println("User Wins!");
	        wins++;
	        System.out.println("	|		Wins: " + wins + "			Losses: " + losses);
	        System.out.println("	|-----------------------------------------------------------|");
	    }
			//Computer wins
			else if(Computer == ROCK){
				System.out.println("User: Scissor \nComputer: Rock");
				System.out.println("Rock beats Scissor!");
				System.out.println("Computer Wins!");
				losses++;
				System.out.println(" 	|		Wins: " + wins + "			Losses: " + losses);
				System.out.println("	|-----------------------------------------------------------|");
				livesLeft = livesLeft -1;
			}
				//User wins
				if(userShape == ROCK)
					if(Computer == SCISSOR ){
					System.out.println("User: Rock\nComputer: Scissor");
					System.out.println("Rock beats Scissor");
					System.out.println("User Wins! ");
					wins++;
					System.out.println(" 	|		Wins: " + wins + "			Losses: " + losses);
					System.out.println("	|-----------------------------------------------------------|");
				}
					//Computer wins
					else if (Computer == PAPER){
						System.out.println("User: Rock\nComputer: Paper");
						System.out.println("Paper beats Rock!");
						System.out.println("Computer Wins!");
						losses++;
						System.out.println(" 	|		Wins: " + wins + "			Losses: " + losses);
						System.out.println("	|-----------------------------------------------------------|");
						livesLeft = livesLeft -1;
					}
						//User Wins
						if(userShape == PAPER)
							if(Computer == ROCK){
							System.out.println("User: Paper\nComputer: Rock");
							System.out.println("Paper beats Rock");
							System.out.println("User Wins!");
							wins++;
							System.out.println(" 	|		Wins: " + wins + "			Losses: " + losses);
							System.out.println("	|-----------------------------------------------------------|");
						}
						//Computer Wins
						else if (Computer == SCISSOR){
							System.out.println("User: Paper\nComputer: Scissor");
							System.out.println("Scissor beats Paper!");
							System.out.println("Computer Wins!");
							losses++;
							System.out.println(" 	|		Wins: " + wins + "			Losses: " + losses);
							System.out.println("	|-----------------------------------------------------------|");
							livesLeft = livesLeft -1;
							}
								if(games==0){
								System.out.println();
								System.out.println("Game Over!	Game Over!	Game Over!	Game Over!");
							}

		}

		//The below DO WHILE loop will allow the game to run untils lives are all gone or number of games has been played.
				public void gameLoop(){

					captureGames();

						do{

							//while (livesLeft > 0);

							//Get user shape
							getUserShape();

							//Allow the computer to generate a shape choice

							Random computerChoice = new Random();
							Computer = 1+computerChoice.nextInt(3);
							System.out.println();
							System.out.println("Computers Choice =  " + Computer);
							System.out.println();


							//Calculate the winner

							calculateWinner();

							//Display Liveleft and decrease the number of games

							System.out.println();
							System.out.println("				 Lives Left = " + livesLeft);
							games = games - 1;

							//Keep track of all lives until they reach 0 and then stop the program

							if (livesLeft <= 0){
								System.out.println();
								System.out.println("You have no more lives left. Game Over.");
								break;
								}

							}

							while (games > 0);

						/*System.out.println();
						System.out.println("Game Shape Choices: ");
						for (int i = 0; i < shapeChoices.length; i++){
							for (int j = 0; j < shapeChoices[i].length; j++){
								System.out.print(shapeChoices[i][j] + " ");
							}
						}*/

				}

}