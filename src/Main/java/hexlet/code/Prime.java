package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        String name = Cli.greet();
        System.out.println("\nAnswer 'yes' if the number is prime, otherwise answer 'no'.");
        int rightAnswer = 0;
        Random random = new Random();

        while (rightAnswer < 3) {
            String answer;
            int number = random.nextInt(101);
            System.out.println(number + " is it prime?");
            boolean isPrime = true;
            if (number < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                answer = "yes";
            } else {
                answer = "no";
            }

            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            if (input.toLowerCase().equals(answer)) {
                rightAnswer++;
                System.out.println("Answer: " + input + "\nCorrect!");
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
