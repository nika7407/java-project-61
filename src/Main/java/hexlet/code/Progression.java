package hexlet.code;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Progression {
    public static void main(String[] args) {
        String name = Cli.greet();
        System.out.println("\n" + name + ", you will be given random progression\nand you will need to write missing element");

        Random rand = new Random();
        int min = 6; // inclusive
        int max = 12; // exclusive
        int rightAnswer = 0;

        while (rightAnswer < 3) {
            int start = rand.nextInt(101);
            int step = rand.nextInt(10) + 1;
            int randomInt = rand.nextInt(max - min) + min;
            int empty = rand.nextInt(randomInt);

            for (int i = 0; i < randomInt; i++) {
                if (i != empty) {
                    System.out.print(start + (step * i) + " ");
                } else {
                    System.out.print("... ");
                }

            }
            System.out.println("\n");
            int answer = start + (step * empty);
            Scanner scanner = new Scanner(System.in);
            int input = 0;
            try {
                input = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nWrong!, thats not a number\ncorrect answer: " + answer);
                rightAnswer = 0;
                System.out.println("you're wrong," + name + " Better luck next time!\n");
                Cli.printMenu();
                break;
            }
            if (input == answer) {
                System.out.println("Answer: " + input + "\nCorrect!\n");
                rightAnswer++;
            } else {
                System.out.println("Answer: " + input + "\nWrong!\ncorrect answer: " + answer);
                rightAnswer = 0;
                System.out.println("you're wrong," + name + " Better luck next time!\n");
                Cli.printMenu();
                break;
            }



        }
        if (rightAnswer == 3) {
            System.out.println("Congratulations " + name + " you won!");
            Cli.printMenu();


        }

    }
}
