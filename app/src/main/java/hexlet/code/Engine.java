package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void Run(String[][] answersQuestions,String gameObjective) {
        int question = 0;
        int answer = 1;
        int currentRound  = 0;
        int rounds = 3;
        // variables
     String userName = Cli.greet();
     while (currentRound < rounds) {

         System.out.println(gameObjective);
         System.out.println("Question: "+answersQuestions[currentRound][question]);
         Scanner scanner = new Scanner(System.in);
         String input = scanner.nextLine();

         if (input.equals(answersQuestions[currentRound][answer])) {
             System.out.println("Correct!");
             currentRound++;
         } else {
             System.out.println("'"+input+"' is wrong answer ;(. Correct answer was '"+answersQuestions[currentRound][1]+"'.\n" +
                     "Let's try again, "+ userName +"!);");
             System.exit(0);

         }



     }

        System.out.println("Congratulations, "+ userName +"!");


    }
}
