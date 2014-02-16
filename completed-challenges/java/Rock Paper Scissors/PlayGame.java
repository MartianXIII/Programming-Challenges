package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class PlayGame {

    private Scanner user_input;
    private String player_choice;
    //
    private boolean playerOneRock;
    private boolean playerOnePaper;
    private boolean playerOneScissors;
    //
    private boolean playerTwoRock;
    private boolean playerTwoPaper;
    private boolean playerTwoScissors;
    //
    private Random playerTwo;
    private int playerTwoValue;

    public PlayGame() {

        user_input = new Scanner(System.in);

        playerOneRock = false;
        playerOnePaper = false;
        playerOneScissors = false;

        playerTwoRock = false;
        playerTwoPaper = false;
        playerTwoScissors = false;

        playerTwo = new Random();
    }

    /*
     * Plays the game
     */
    public void playgame() {

        /*
         * Lets the player input their choice, stores the value in player_choice
         */
        System.out.println("Rock, Paper, Scissors?: ");
        player_choice = user_input.next();

        /*
         * Assigns a random interger to playerTwoValue
         */
        playerTwoValue = playerTwo.nextInt(301);

        /*
         * From the users input, it is determined what they chose
         */
        if (player_choice.equals("rock") || player_choice.equals("Rock")) {
            playerOneRock = true;
        } else if (player_choice.equals("paper") || player_choice.equals("Paper")) {
            playerOnePaper = true;
        } else if (player_choice.equals("scissors") || player_choice.equals("Scissors")) {
            playerOneScissors = true;
        } else {
            System.out.println("Please choose either rock, paper or scissors");
        }

        /*
         * Using the integer assigned to playerTwoValue, it 
         * is decided whether rock, paper, or scissors are picked
         */
        if (playerTwoValue < 100) {
            playerTwoRock = true;
        } else if (playerTwoValue >= 100 && playerTwoValue < 200) {
            playerTwoPaper = true;
        } else if (playerTwoValue > 200 && playerTwoValue <= 300) {
            playerTwoScissors = true;
        }

        /*
         * Outcome is deduced and declared
         */
        if (playerOneRock == true && playerTwoPaper == true) {
            System.out.println("You Lose!");
        } else if (playerOneRock == true && playerTwoScissors == true) {
            System.out.println("You Win!");
        } else if (playerOneRock == true && playerTwoRock == true) {
            System.out.println("It's a draw!");
        } else if (playerOnePaper == true && playerTwoRock == true) {
            System.out.println("You Win!");
        } else if (playerOnePaper == true && playerTwoScissors == true) {
            System.out.println("You Lose!");
        } else if (playerOnePaper == true && playerTwoPaper == true) {
            System.out.println("It's a draw!");
        } else if (playerOneScissors == true && playerTwoRock == true) {
            System.out.println("You Lose!");
        } else if (playerOneScissors == true && playerTwoPaper == true) {
            System.out.println("You Win!");
        } else if (playerOneScissors == true && playerTwoScissors == true) {
            System.out.println("It's a draw!");
        }
    }
}
