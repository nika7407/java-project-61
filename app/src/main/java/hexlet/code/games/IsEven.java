package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class IsEven {

    private static final int UPPER_LIMIT = 100;
    private static final int AMOUNT_OF_ROUNDS = 3;

    public static void main(String[] args) {
        int question = 0;
        int answer = 1;
        String gameObjective = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] answersQuestions = new String[AMOUNT_OF_ROUNDS][2];
        Random random = new Random();

        for (int currentRound = 0; currentRound < AMOUNT_OF_ROUNDS; currentRound++) {
            int number = random.nextInt(UPPER_LIMIT) + 1;
            answersQuestions[currentRound][question] = String.valueOf(number);

            if (number % 2 == 0) {
                answersQuestions[currentRound][answer] = "yes";
            } else {
                answersQuestions[currentRound][answer] = "no";
            }
        }

        Engine.run(answersQuestions, gameObjective);
    }
}
