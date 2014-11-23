public class RockPaperScissors2 {

        public static void displayGreeting()
        {
            String intro = "This program is a game.  A game of Rock, Paper, Scissors\n"+
                           "It is you against the computer.  Rock beats scissors, Paper\n"+
                           " beats rock, and scissors beats paper.  Good luck and may the\n"+
                           "odds be ever in your favor.";
            JOptionPane.showMessageDialog(null, intro, "Rock Paper Scissors",1);
        }

        public static String generateComputersChoice()
        {
            Random randomGenrator = new Random();
            int randomNumber = randomGenrator.nextInt(3);

            String weapon = "nothing";
            switch(randomNumber){
            case 0: weapon = "rock";
                break;
            case 1: weapon = "paper";
                break;
            case 2: weapon = "scissors";
                break;
            }
            return weapon;
            }

        public static String enterPlayersChoice(){

            String prompt = "You have a choice of picking rock, paper, or scissors.\n"+
                            "Choose wisely.";

            String input = "";

            input = JOptionPane.showInputDialog(null,prompt,"Choose your weapon",1);
            String inputLower = input.toLowerCase();
            return inputLower;

        }

        public static void main(String[] args)
        {
            displayGreeting();
          // generateComputersChoice();
           //enterPlayersChoice();
           // JOptionPane.showMessageDialog(null,generateComputersChoice()+ enterPlayersChoice(5));

            String player = enterPlayersChoice();
            String comp = generateComputersChoice();

            int ties = 0;
            int playerWins = 0;
            int compWins = 0;

            for(int i = 0; i < 3; i ++){



                //enterPlayersChoice(); //method

                //generateComputersChoice();  //method
                //JOptionPane.showMessageDialog(null,generateComputersChoice()+ enterPlayersChoice(1));

                //System.out.println(player+ " " + comp);
                //JOptionPane.showMessageDialog(null,player+ " " +comp);

                if(player.equals(comp)){
                    JOptionPane.showMessageDialog(null, "It's a tie!");
                    ties ++;

                }
                else if(player.equals("rock")){
                    if(comp.equals("scissors")){
                        JOptionPane.showMessageDialog(null, "You win!");
                        playerWins ++;

                    }
                }else if(comp.equals("rock")){
                    if(player.equals("scissors")){
                        JOptionPane.showMessageDialog(null, "You lose!");
                        compWins ++;

                    }
                }else if(player.equals("scissors")){
                    if(comp.equals("paper")){
                        JOptionPane.showMessageDialog(null, "You win!");
                        playerWins ++;

                    }
                }else if(comp.equals("scissors")){
                    if(player.equals("paper")){
                        JOptionPane.showMessageDialog(null, "You lose");
                        compWins ++;

                    }
                }else if(player.equals("paper")){
                    if(comp.equals("rock")){
                        JOptionPane.showMessageDialog(null, "You Win!");
                        playerWins ++;
                    }
                }else if(comp.equals("paper")){
                    if(player.equals("rock")){
                        JOptionPane.showMessageDialog(null, "You lose!");
                        compWins ++;
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid user input");
                    i--;
                }


            }
          //Results
            JOptionPane.showMessageDialog(null,"Here are the results\n\n"+
                                               "\nTies: " +ties+
                                               "\nComputer Wins: " +compWins+
                                               "\nPlayer Wins: " + playerWins+
                                               "\n\n Program Terminating", "Results",1);


      }

     }