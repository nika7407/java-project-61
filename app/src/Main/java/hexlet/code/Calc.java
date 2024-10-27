package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Calc {
    public static void main(String[] args) {

        String name = Cli.greet();
        System.out.println("\n" + name + ", you will be given random matematical expression,and you need to answer it");
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        int rightAnswer = 0;

        while (rightAnswer < 3) {
            int answer = 0;
            int number1 = rand1.nextInt(20);
            int number2 = rand2.nextInt(20);
            int operatorVariable = rand3.nextInt(3);

            switch (operatorVariable) {

                case 0:
                    answer = number1 + number2;
                    System.out.println("What is " + number1 + " + " + number2 + " ?");
                    break;

                case 1:
                    answer = number1 - number2;
                    System.out.println("What is " + number1 + " - " + number2 + " ?");
                    break;

                case 2:
                    if (number1==0) {
                        number1++;
                    } else if (number2==0){
                        number2++;
                    }

                    answer = number1 * number2;
                    System.out.println("What is " + number1 + " * " + number2 + " ?");
                    break;

            }

            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input == answer) {
                System.out.println("Answer: " + input + "\nCorrect!\n");
                rightAnswer++;
            } else {
                System.out.println("Answer: " + input + "\nWrong!\ncorrect answer: " + answer);
                rightAnswer = 0;
                System.out.println("you're wrong," + name + " Better luck next time!\n");
                Cli.printMenu();
                return;
            }

        }
        if (rightAnswer == 3) {
            System.out.println("Congratulations " + name + " you won!");
            App.main(args);

        }
    }
}
