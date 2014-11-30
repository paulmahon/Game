/*
 *	RPSGame.java - Rock Paper Scissors Game
 *  Instantiable Class
 *	@author Paul Mahon
 *	Student ID: 14119145
 *	20/11/14
 */

import java.util.Scanner;
import java.util.Random;

public class RPSGame{
	//set data members or varibles (They must be private)
	private String Game[] = {"Player Won","Computer Won","Player Lost","Computer Lost"};
	private int GameStats [][];
	private int Rock = 1;
	private int Paper = 2;
	private int Scissors = 3;
	private String Shapes[] = {"Rock","Paper","Scissors"};
	private int arrNumGames[];
	//private String Player;
	//private String Computer;
	private int myNumGames;
	//private int roundHistory;
	//private int gameHistory;
	private int lives;

	//constructor (initalise varibles)
	public RPSGame(){

	//	Player = new String();
	//	Computer = new String();
		//numGames = 0;
	//	numLives = 0;
	//	roundHistory = 0;
	//	gameHistory = 0;
		lives = 3;


	}

	//set methods - one for every input
	Scanner sc = new Scanner(System.in); //to get user input from the keyboard
    Random pcChoice = new Random(); //to make random choices for the computer

    	public void setnumGames(int numGames){
			this.myNumGames=numGames;

			int arrNumGames[] = new int[myNumGames];


	}

	//public void
		//this.

	//compute - process

	//get methods - one for every output

	//public int getSomthing()
	//	return something;



}