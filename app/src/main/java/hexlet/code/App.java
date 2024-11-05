package hexlet.code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void printMenu() {
        System.out.println("--------\n| MENU | \n--------\n"
                + "to start please enter corresponding number: "
                + "\n1 - Greet\n2 - IsEven\n3 - Calculator\n"
                + "4 - GDC\n5 - Progression\n6 - IsPrime\n0 - Exit");

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

    public static void main(String[] args) {
        App.printMenu();

            int choice = App.numberInput();
            switch (choice) {
                case 1:
                    Cli.greet();
                    break;

                case 2:
                    IsEven.main(args);
                    break;

                case 3:
                    Calc.main(args);
                    break;

                case 4:
                    GCD.main(args);
                    break;

                case 5:
                    Progression.main(args);
                    break;

                case 6:
                    Prime.main(args);
                    break;


                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }




    }


