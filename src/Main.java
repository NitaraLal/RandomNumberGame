// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Random Number Game");

        System.out.println("I am thinking of a number from 1-100. Can you guess the number?: ");

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int userGuess = scanner.nextInt();
        int randNumber = rand.nextInt(1, 101);
        while (userGuess != randNumber) {
            if (userGuess < randNumber) {
                System.out.println("your guess was too low");
            } else {
                System.out.println("your guess was too high");
            }
            System.out.print(", please try again: ");
            userGuess = scanner.nextInt();
        }
        System.out.println("you got it!  My number was " + randNumber);

        }
}
