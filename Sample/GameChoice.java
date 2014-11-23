import java.util.*;

/**
* Each object of this instantiable class represents one of a player's
* possible choices in the game rock-paper-scissors.
*/ 
public class GameChoice {
    //Constants that represent the 3 choices
    public static final int ROCK = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    //holds an int constant saying what type this is (rock,paper,scissors)
    private int myType;
    
    public GameChoice(String type) {
        type = type.toUpperCase();
        if (type.charAt(0) == 'S') {
            myType = SCISSORS;
        }
        else if (type.charAt(0) == 'P') {
            myType = PAPER;
        }
        else if (type.charAt(0) == 'R') {
            myType = ROCK;
        }
        else {
            System.out.println("Invalid choice - you get rock!");
            myType = ROCK;
        }
    }
    
    public GameChoice(int type) {
        myType = type;
    }
    
    public boolean beats(GameChoice g) {
        if(g.myType == ROCK && myType == PAPER) {
            return true;
        }
        else if(g.myType == SCISSORS && myType == ROCK) {
            return true;
        }
        else if(g.myType == PAPER && myType == SCISSORS) {
            return true;
        }
        else  {
            return false;
        }
    }
    
    public boolean drawsAgainst(GameChoice g) {
        return (myType == g.myType);
    }
    
    public String toString() {
        switch(myType) {
            case ROCK: return "Rock";
            case PAPER: return "Paper";
            case SCISSORS: return "Scissors";
            default : return "SOMETHING IS AFOUL";
        }
    }
}