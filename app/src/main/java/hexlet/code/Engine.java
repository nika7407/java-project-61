package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;

    public static void run(String[][] answersQuestions, String gameObjective) {
        int question = 0;
        int answer = 1;
        int currentRound = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        for (int round = 0; round < ROUNDS; round++) {

                System.out.println(gameObjective);
                System.out.println("Question: " + answersQuestions[round][question]);

                String input = scanner.nextLine();

                if (input.equals(answersQuestions[round][answer])) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + input + "' is wrong answer ;(. Correct answer was '"
                            + answersQuestions[round][1] + "'.\nLet's try again, " + userName + "!");
                    System.exit(0);
                }
            }

        System.out.println("Congratulations, " + userName + "!");
    }
}
