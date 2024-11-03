package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void Run(String[][] answersQuestions,String gameObjective) {

     String name = Cli.greet() ;

     int roundCounter = 0;
     while (roundCounter < 3) {

         System.out.println(gameObjective);
         System.out.println("Question: "+answersQuestions[roundCounter][0]);
         Scanner scanner = new Scanner(System.in);
         String input = scanner.nextLine();

         if (input.equals(answersQuestions[roundCounter][1])) {
             System.out.println("Correct!");
             roundCounter++;
         } else {
             System.out.println("'"+input+"' is wrong answer ;(. Correct answer was '"+answersQuestions[roundCounter][1]+"'.\n" +
                     "Let's try again, "+name+"!);");
             System.exit(0);

         }



     }

        System.out.println("Congratulations, "+name+"!");


    }
}
