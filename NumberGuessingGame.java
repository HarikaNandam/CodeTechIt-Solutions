import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1; // Lower bound of the number range
        int upperBound = 100; // Upper bound of the number range
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound; // Generate a random number

        int attempts = 0;
        int guess;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ". Can you guess it?");

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                guessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number " + numberToGuess + " correctly in " + attempts + " attempts.");
            }
        }
    }
}
