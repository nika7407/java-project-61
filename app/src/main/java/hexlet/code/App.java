package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.IsEven;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    // Define constants for menu options (magic numbers)
    private static final int GREET_OPTION = 1;
    private static final int ISEVEN_OPTION = 2;
    private static final int CALCULATOR_OPTION = 3;
    private static final int GCD_OPTION = 4;
    private static final int PROGRESSION_OPTION = 5;
    private static final int ISPRIME_OPTION = 6;
    private static final int EXIT_OPTION = 0;

    public static void printMenu() {
        System.out.println("--------\n| MENU | \n--------\n"
                + "To start, please enter the corresponding number: "
                + "\n" + GREET_OPTION + " - Greet\n"
                + ISEVEN_OPTION + " - IsEven\n"
                + CALCULATOR_OPTION + " - Calculator\n"
                + GCD_OPTION + " - GCD\n"
                + PROGRESSION_OPTION + " - Progression\n"
                + ISPRIME_OPTION + " - IsPrime\n"
                + EXIT_OPTION + " - Exit");
    }

    public static int numberInput() {
        Scanner userInput = new Scanner(System.in);

        while (true) {
            try {
                return userInput.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number:");
                userInput.next(); // Clear the invalid inputeow
            }
        }
    }

    public static void main(String[] args) {
        App.printMenu();

        int choice = App.numberInput();
        switch (choice) {
            case GREET_OPTION:
                Cli.greet();
                break;

            case ISEVEN_OPTION:
                IsEven.game(args);
                break;

            case CALCULATOR_OPTION:
                Calc.game(args);
                break;

            case GCD_OPTION:
                GCD.game(args);
                break;

            case PROGRESSION_OPTION:
                Progression.game(args);
                break;

            case ISPRIME_OPTION:
                Prime.game(args);
                break;

            case EXIT_OPTION:
                System.out.println("Goodbye!");
                break;

            default:
                System.out.println("Wrong input!");
                break;
        }
    }
}
