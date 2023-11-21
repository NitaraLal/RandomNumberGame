import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Random Number Game!");

        System.out.print("I am thinking of a number from 1-100. Can you guess the number?: ");

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int userGuess = scanner.nextInt();
        int randNumber = rand.nextInt(1, 101);
        int scoreCounter = 0;

        while (userGuess != randNumber) {
            if (userGuess < randNumber) {
                System.out.println("Your guess was too low.");
            } else {
                System.out.println("Your guess was too high.");
            }
            System.out.print("Please try another number: ");
            userGuess = scanner.nextInt();

            scoreCounter++;
        }
        System.out.println("You got it! My number was " + randNumber + ".");
        System.out.println("It took you " + scoreCounter + " attempts to guess the number.");
        scoreCounter = 0;


        System.out.print("Would you like to play again? Please type Yes or No: ");
        String decision = scanner.next();
        if (decision.equalsIgnoreCase("No")) {
            System.out.println("Thank you for playing the Random Number Game!");
        } else {
            while (!decision.equalsIgnoreCase("No")) {
                System.out.print("Great! Let's play again. Please guess the number: ");
                userGuess = scanner.nextInt();
                randNumber = rand.nextInt(1, 101);
                while (userGuess != randNumber) {
                    if (userGuess < randNumber) {
                        System.out.println("Your guess was too low.");
                    } else {
                        System.out.println("Your guess was too high.");
                    }
                    System.out.print("Please try another number: ");
                    userGuess = scanner.nextInt();
                    scoreCounter++;
                }
                System.out.println("You got it! My number was " + randNumber + ".");
                System.out.println("It took you " + scoreCounter + " attempts to guess the number.");

                System.out.print("Would you like to play again? Please type Yes or No: ");
                decision = scanner.next();
            }
            System.out.print("Thank you for playing the Random Number Game!");
        }


    }

}
