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
	private int livesLeft = 3;
	private int playerShape = 0;
	private int playerShapeChoices [][];
	private int computerShapeChoices [][];
	private int rock=1;
    private int paper=2;
    private int scissor=3;
    private int computer;
	private Scanner	input = new Scanner (System.in);



		//Ask the user how many games he/she wishes to play
		public void captureGames(){
			System.out.println("How many games do you want to play?");
			games = input.nextInt();

			//2D array used to captures the players shape choice for each game played
			playerShapeChoices = new int [games][50];

			//2D array used to captures the computers shape choice for each game played
			computerShapeChoices = new int [games][50];

		}

			//Prompt the player for shape choice & display number of games
			public void getPlayerShape(){
				System.out.println();
				System.out.println();
				System.out.println("Please choose the number for your shape:");
				System.out.println();
				System.out.println("	Rock 	 = 1");
				System.out.println("	Paper 	 = 2"				+" 			No. Games Remaining: " + games);
				System.out.println("	Scissors = 3");

				//Capture input from the players choice of shape using the scanner & display his/her choice
				playerShape = input.nextInt();
				System.out.println("	|-----------------------------------------------------------|");
				System.out.println();
				System.out.println("Players Chooses No.: " + playerShape);

			}

		//All the below code will calcuate the results of each games based on choices made by the player and computer
		public void calculateWinner(){

				//The below code will calculate if the game was a DRAW
				if(playerShape == computer){
						if(playerShape == scissor){
						System.out.println("You Both Played SCISSORS");
						}
							if(playerShape == rock){
							System.out.println("You Both Played ROCK");
							}
								if(playerShape == paper){
								System.out.println("You Both Played PAPER");
								}

					System.out.println("Result is a DRAW");
					System.out.println();
					System.out.println("	|	Player Wins: " + wins + "		Player Losses: " + losses);
					System.out.println("	|	Computer Wins: " + losses + "	Computer Losses: " + wins);
					System.out.println("	|-----------------------------------------------------------|");
				}

				//This is the code when the PLAYER WINS using SCISSORS
				if(playerShape == scissor)
					if(computer == paper){
					System.out.println("Players shape is  SCISSORS");
					System.out.println("Computers shape is PAPER");
					System.out.println();
					System.out.println("Scissor beats Paper so PLAYER Wins!");
					System.out.println();
					wins++;
					System.out.println("	|	Player Wins: " + wins + "		Player Losses: " + losses);
					System.out.println("	|	Computer Wins: " + losses + "	Computer Losses: " + wins);
					System.out.println("	|-----------------------------------------------------------|");

				}
					//This is the code when the COMPUTER WINS using ROCK
					else if(computer == rock){
							System.out.println("Players shape is  SCISSORS");
							System.out.println("Computers shape is ROCK");
							System.out.println();
							System.out.println("Rock beats Scissors so COMPUTER Wins!");
							System.out.println();
							losses++;
							System.out.println("	|	Player Wins: " + wins + "		Player Losses: " + losses);
							System.out.println("	|	Computer Wins: " + losses + "	Computer Losses: " + wins);
							System.out.println("	|-----------------------------------------------------------|");
							livesLeft = livesLeft -1;
					}
						//This is the code when the PLAYER WINS using ROCK
						if(playerShape == rock)
							if(computer == scissor ){
							System.out.println("Players shape is  ROCK");
							System.out.println("Computers shape is SCISSORS");
							System.out.println();
							System.out.println("Rock beats Scissors so PLAYER Wins!");
							System.out.println();
							wins++;
							System.out.println("	|	Player Wins: " + wins + "		Player Losses: " + losses);
							System.out.println("	|	Computer Wins: " + losses + "	Computer Losses: " + wins);
							System.out.println("	|-----------------------------------------------------------|");
						}
							//This is the code when the COMPUTER WINS using PAPER
							else if (computer == paper){
								System.out.println("Players shape is  ROCK");
								System.out.println("Computers shape is PAPER");
								System.out.println();
								System.out.println("Paper beats Rock so COMPUTER Wins!");
								System.out.println();
								losses++;
								System.out.println("	|	Player Wins: " + wins + "		Player Losses: " + losses);
								System.out.println("	|	Computer Wins: " + losses + "	Computer Losses: " + wins);
								System.out.println("	|-----------------------------------------------------------|");
								livesLeft = livesLeft -1;
							}
								//This is the code when the PLAYER WINS using PAPER
								if(playerShape == paper)
									if(computer == rock){
									System.out.println("Players shape is  PAPER");
									System.out.println("Computers shape is ROCK");
									System.out.println();
									System.out.println("Paper beats Rock so PLAYER Wins!");
									System.out.println();
									wins++;
									System.out.println("	|	Player Wins: " + wins + "		Player Losses: " + losses);
									System.out.println("	|	Computer Wins: " + losses + "	Computer Losses: " + wins);
									System.out.println("	|-----------------------------------------------------------|");
								}
								//This is the code when the COMPUTER WINS using SCISSORS
								else if (computer == scissor){
									System.out.println("Players shape is  PAPER");
									System.out.println("Computers shape is SCISSORS");
									System.out.println();
									System.out.println("Scissors beats Paper so COMPUTER Wins!");
									System.out.println();
									losses++;
									System.out.println("	|	Player Wins: " + wins + "		Player Losses: " + losses);
									System.out.println("	|	Computer Wins: " + losses + "	Computer Losses: " + wins);
									System.out.println("	|-----------------------------------------------------------|");
									livesLeft = livesLeft -1;
									}
										if(games==0){
										System.out.println();
										System.out.println("Game Over - Number of Games Choosen has been reached - Game Over!");
									}

		}

		//The below DO WHILE loop will allow the game to run until lives are all gone or number of games has been played.
				public void gameLoop(){

					captureGames();

						do{

							//Get player shape
							getPlayerShape();

							//Allow the computer to generate a shape choice

							Random computerShape = new Random();
							computer = 1+computerShape.nextInt(3);
							System.out.println();
							System.out.println("Computers Chooses No.:  " + computer);
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
							System.out.println();
							System.out.println("All Games have been played. Game Over.");

							//Traverse the playerShapeChoices array and display the choices for the game. Unfortunatly I was unsuccessful in getting this part working.

							/* for (int i = 0; i < playerShapeChoices.length; i++){
									 System.out.println(playerShapeChoices "Game Number "[i] + " ");
										for (int j = playerShape; j < playerShapeChoices[i].length; j++){
											System.out.println("Shape Choices: " + j + "(Rock = 1, Paper = 2, Scissors = 3)");
										}
								}*/
				}
}