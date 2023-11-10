/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tr07_q1ex04;
import java.util.*; 
/**
 *
 * @author Jerrold Berana
 */
public class Tr07_Q1Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
	Move scissors = new Move("Scissors");
		
	rock.setStrongAgainst(scissors);
	paper.setStrongAgainst(rock);
	scissors.setStrongAgainst(paper);
        Scanner sc = new Scanner(System.in);

        
        int numberOfWins = 2;
        
        String status = "";
        while (true) {
            
            System.out.println("\n" + "Welcome to Rock, Paper, Scissors. Please choose an option:");
            System.out.println("""
                           1. Start game
                           2. Change number of rounds
                           3. Exit application""");
            
            int userInput = sc.nextInt(); 
            
            switch (userInput) {
            case 1:
                System.out.println("\n" + "This match will be first to " + numberOfWins + " wins.");
                int numberOfGames = 0;
                int playerScore = 0;
                int computerScore = 0;
                while (playerScore != numberOfWins && computerScore != numberOfWins) {
                    System.out.println("The computer has selected its move. Select your move:");
                    System.out.println("""
                           1. Rock
                           2. Paper
                           3. Scissors""");
                    int userMove = sc.nextInt(); 
                    Move computerMove;
                    Move playerMove;
                    int random = (int) Math.floor(Math.random()*3) + 1;
                
                    switch (random) {
                        case 1:
                            computerMove = rock;
                            break;
                        case 2:
                            computerMove = paper;
                            break;
                        default:
                            computerMove = scissors;
                            break;
                    }
                    switch (userMove) {
                        case 1:
                            playerMove = rock;
                            break;
                        case 2:
                            playerMove = paper;
                            break;
                        default:
                            playerMove = scissors;
                            break;
                    }
                    int result = Move.compareMoves(computerMove, playerMove);
                    
                    
                    switch (result) {
                        case 0:
                            computerScore++;
                            status = "Computer wins round!";
                            break;
                        case 1:
                            playerScore++;
                            status = "Player wins round!";
                            break;
                        default:
                            status = "Round is tied!";
                            break;
                    }
                    
                    System.out.println("\n" + "Player chose " + playerMove.getName() + ". " + "Computer chose " + computerMove.getName() + ". " + status);
                    System.out.println("Player: " + playerScore + " - Computer: " + computerScore);
                    
                    
                    
                }
                if (playerScore < computerScore) {
                    System.out.println("\n" + "Computer wins!");
                }
                else if (playerScore > computerScore) {
                    System.out.println("\n" + "Player wins!");
                }
                else {
                    System.out.println("\n" + "The player and the computer ties!");
                }
                     
           
                break;
            case 2:
                System.out.println("\n" + "How many wins are needed to win a match?");
                numberOfWins = sc.nextInt(); 
                System.out.println("\n" + "Now setting has been saved");
                break;
            case 3:
                System.out.println("\n" + "Thank you for playing");
                System.exit(0);
                break;
            default:
                System.out.println("Please enter a valid number");
                break;
            }
                    
            
            
        }
    }
    
}
