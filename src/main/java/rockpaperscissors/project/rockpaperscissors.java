package rockpaperscissors.project;

import java.util.Random;
import java.util.Scanner;

public class rockpaperscissors 
{   
    public static void main( String[] args )
    {   
        //create user input
        Scanner scanner = new Scanner(System.in);
        //while loop for playAgain
        while(true) {
        //create array
        String[] moves = {"rock", "paper", "scissors"};

        //randomize computer
        String computerMove = moves[new Random().nextInt(moves.length)];

        //define player variable
        String playerMove;
        
        


        //while loop to keep the game in a loop otherwise it will just end after iterating once
        while (true) {{
            System.out.println("Please enter your move: rock, paper or scissors?");
            //playerMove takes input from user
            playerMove = scanner.nextLine();
            
            if (playerMove.equals("rock") || playerMove.equals("scissors") || playerMove.equals("paper"))
            //breaks if user inputs valid entries of rock, scissors or paper, otherwise will still be in this loop
                break;
            }
            //if user did not input valid entry, keep prompting for valid entry
            System.out.println("Please enter a valid entry.");
        }
            System.out.println("Computer move: " + computerMove);

            //if loop for setting rules of game
            if (playerMove.equals(computerMove)){
                System.out.println("It's a tie!");
            }
                                    
            else if (playerMove.equals("rock")) {
                if (computerMove.equals("paper")) {
                    System.out.println("You lose!");
                }
                    else if (computerMove.equals("scissors")) {
                    System.out.println("You win!");
                    }}

            else if (playerMove.equals("paper")) {
                if (computerMove.equals("scissors")) {
                    System.out.println("You lose!");
                }
                    else if (computerMove.equals("rock")) {
                    System.out.println("You win!");
                    }}

            else if (playerMove.equals("scissors")) {
                if (computerMove.equals("rock")) {
                    System.out.println("You lose!");
                }
                    else if (computerMove.equals("paper")) {
                    System.out.println("You win!");
                    }}
            //Ask user if they want to play again so that programme doesn't end    
            System.out.println("Want to play again? (yes/no)");
            String playAgain = scanner.nextLine();
            //If user did not say yes, system assumes no and breaks out of this while loop and programme.
            if (!playAgain.equals("yes"))
            break; 
                
        }
        
        
        scanner.close();
        
    }
}
        

