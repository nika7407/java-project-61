package hexlet.code;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class GCD {
    public static void main(String[] args) {
        String name = Cli.greet();
      System.out.println("\n"+name+", you will be given two random numbers,\n and you need to write their greatest common divider\n");
      Random rand1 = new Random();
      Random rand2 = new Random();
      int rightAnswer = 0;

      while (rightAnswer<3) {
          int numb1 = rand1.nextInt(40);
          int numb2 = rand2.nextInt(40);
          System.out.println("\nWhat is greatest common divisor of " + numb1 + " and " + numb2+" ?");
          int answer;
          while (numb1 != numb2) {
              if (numb1 > numb2) {
                  numb1 = numb1-numb2;
              } else {
                  numb2 = numb2-numb1;
              }
          }
          answer=numb1;
          Scanner scanner = new Scanner(System.in);
          int input = 1;
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
            App.main(args);

        }

      }
    }

