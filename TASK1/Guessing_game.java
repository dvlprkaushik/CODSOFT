package TASK1;

import java.util.Scanner;
import java.util.Random;

public class Guessing_game {
    public static void main(String[] args) {

        String giveUp = "You gave Up";
        String notGiveUp = "You can continue playing !";
        // Random - Library function
        Random randomNum = new Random();
        // To take user input
        Scanner userInput = new Scanner(System.in);

        // Attempts counter of the user
        int attemptsCounter = 0;

        System.out.println("Computer : Hello , What is your name ? ");
        System.out.print("Player : ");
        String userName = userInput.nextLine();
        System.out.println("Computer : Welcome to the Number Guessing Game " + userName);
        System.out.println("Computer : Enter the Range , I will generate random number within that range !");
        System.out.print(userName + " : ");
        // For random number generation range input
        int range = userInput.nextInt();
        // This will generate a random number.
        int randNumGenerate = randomNum.nextInt(range) + 1;
        System.out.println("Computer : I have Randomly selected a number between 1 and " + range);
        System.out.println("Computer : Can you Guess it ? ");
        System.out.println("Computer : Choose any one option -> \n 1.Yes \n 2.No");
        System.out.print(userName + " : ");
        int inPut = userInput.nextInt();

        boolean correctGuess = false;
        if (inPut == 1) {
            System.out.println("Computer : " + notGiveUp);
            System.out.println("Computer : Let's Start the game " + userName + " !!");
            // The loop will run until the correctGuess is -> true
            while (!correctGuess) {
                System.out.print("Computer : Enter Your Guess -> ");
                int Guess = userInput.nextInt();
                // The counter will increment after each iteration until the conditon becomes
                // false
                attemptsCounter++;

                if (Guess < randNumGenerate) {
                    System.out.println("Computer : Too Low! you can try again " + userName);
                } else if (Guess > randNumGenerate) {
                    System.out.println("Computer : Too High! you can try again " + userName);
                } else {
                    System.out.println("Computer : Congragulations " + userName
                            + "!! You have guessed the correct number in " + attemptsCounter
                            + " number of attempts, good job.");
                    correctGuess = true;
                }
            }
        } else if (inPut == 2) {
            System.out.println("Computer : HAHA! " + giveUp + " " + userName);
            System.out.println("Computer : The Random Number generated is -> " + randNumGenerate);
        } else{
            System.out.println("Computer : Invalid choice !");
        }
        System.out.println("Computer : Thank You for playing the game.");
        userInput.close();
    }
}