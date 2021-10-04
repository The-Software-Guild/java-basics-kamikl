package org.c130.javabasics;
//Import necessary packages
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    //Set up Random and Scanner objects for use
    private static Random random = new Random();
    private static Scanner inputReader = new Scanner(System.in);

    public static void main(String[] args) {
        //Initialise the game
        initialise();
    }

    public static void play(int rounds){
        //Reset score variables
        int wins = 0, losses = 0, ties = 0;

        //For each round
        for(int i=1; i<=rounds; i++) {
            //Display current round
            System.out.println("Round "+i+":");
            //Prompt user for move choice
            System.out.println("Enter 1 for Rock, 2 for Paper, 3 for Scissors.");
            int userChoice = inputReader.nextInt();
            //Generate random move from CPU opponent
            int CPUchoice = random.nextInt(3) +1;

            // If both players choose same move, it is a tie
            if (userChoice == CPUchoice) {
                ties += 1;
                System.out.println("TIE");
            }
            //If player chooses Rock,
            else if (userChoice == 1) {
                //and opponent chooses Paper, it is a loss
                if(CPUchoice == 2) {
                    System.out.println("Computer WIN");
                    losses+=1;
                }
                //and opponent chooses Scissors, it is a win
                else {
                    System.out.println("Player WIN");
                    wins+=1;
                }
            }
            //If player chooses Paper,
            else if (userChoice == 2) {
                //and opponent chooses Rock, it is a win
                if(CPUchoice== 1) {
                    System.out.println("Player WIN");
                    wins+=1;
                }
                //and opponent chooses scissors, it is a loss
                else{
                    System.out.println("Computer WIN");
                    losses+=1;
                }
            }
            //If player choses Scissors,
            else if (userChoice == 3) {
                //and opponent chooses Rock, it is a loss
                if(CPUchoice == 1) {
                    System.out.println("Computer WIN");
                    losses+=1;
                }
                //and opponent chooses paper, it is a win
                else {
                    System.out.println("Player WIN");
                    wins+=1;
                }
            }
        }

        //Display total scores
        System.out.println("Total losses: "+losses);
        System.out.println("Total wins: "+wins);
        System.out.println("Total ties: "+ties);

        //Display overall decision (win/tie/loss) by comparing wins and losses
        if(wins>losses) {
            System.out.println("Congratulations for winning!");
        }
        else if(wins==losses) {
            System.out.println("Sorry, but you tied.");
        }
        else {
            System.out.println("Sorry, but you lost this time.");
        }

        //Prompt player on whether they would like to play again
        System.out.println("Would you like to play again? (y/n)");

        inputReader.nextLine();
        String playAgain = inputReader.nextLine();

        //Start game again if player wishes to do so
        if(playAgain.equals("y")){
            initialise();
        }
        //Or display thank you message and finish
        else if(playAgain.equals("n")){
            System.out.println("Thanks for playing!");
        }
    }

    public static void initialise() {
        //Prompt user for number of rounds
        System.out.println("Please enter number of rounds you wish to play (from 1-10)");
        int rounds = inputReader.nextInt();

        //If number entered is outside of range, error is displayed and program quits
        if(rounds<1 || rounds>10) {
            System.out.println("Incorrect number of rounds entered.");
            System.exit(0);
        }
        //Otherwise, start game for given number of rounds
        play(rounds);
    }

}
