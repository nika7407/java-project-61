package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final int ROUNDS = 3;

    public static void run(String[][] answersQuestions, String gameObjective) {
        int question = 0;
        int answer = 1;
        int currentRound = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

            while (currentRound < ROUNDS) {

                System.out.println(gameObjective);
                System.out.println("Question: " + answersQuestions[currentRound][question]);

                String input = scanner.nextLine();

                if (input.equals(answersQuestions[currentRound][answer])) {
                    System.out.println("Correct!");
                    currentRound++;
                } else {
                    System.out.println("'" + input + "' is wrong answer ;(. Correct answer was '"
                            + answersQuestions[currentRound][1] + "'.\nLet's try again, " + userName + "!");
                    System.exit(0);
                }
            }

        System.out.println("Congratulations, " + userName + "!");
    }
}
