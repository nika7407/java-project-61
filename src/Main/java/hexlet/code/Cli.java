package hexlet.code;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Cli {


    public static String greet() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nPlease input your name and press enter:");
        String name = userInput.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static int numberInput() {
        Scanner userInput = new Scanner(System.in);

        while (true) {
            try {
                return userInput.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number:");
                userInput.next(); // Clear the invalid input
            }
        }
    }

    public static void printMenu() {
        System.out.println("--------\n| MENU | \n--------\nto start please enter corresponding number: "
                + "\n1 - Greet\n2 - IsEven\n3 - Calculator\n4 - GDC\n5 - Progression\n6 - IsPrime\n0 - Exit");

    }
}
