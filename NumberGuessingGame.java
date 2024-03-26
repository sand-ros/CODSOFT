import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int userGuess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            userGuess = input.nextInt();
            attempts++;

            if (userGuess == generatedNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                System.out.println("Do you want to play again? (1: Yes, 0: No)");
                int playAgain = input.nextInt();
                if (playAgain == 1) {
                    generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
                    attempts = 0;
                    System.out.println("I've picked a new number. Let's play again!");
                } else {
                    System.out.println("Thank you for playing! Your final score is: " + attempts);
                    break;
                }
            } else if (userGuess < generatedNumber) {
                System.out.println("Too low. Try again!");
            } else {
                System.out.println("Too high. Try again!");
            }
        } while (true);

        input.close();
    }
}
