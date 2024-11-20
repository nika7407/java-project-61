package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.getRandomInt;

public class IsEven {

    private static final int UPPER_LIMIT = 100;
    private static final int AMOUNT_OF_ROUNDS = 3;
    private static final int LOWER_LIMIT = 1;

    public static boolean isNumberEven(int number) {
        return number % 2 == 0;
    }

    public static void game() {
        int question = 0;
        int answer = 1;
        String gameObjective = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] answersQuestions = new String[AMOUNT_OF_ROUNDS][2];

        for (int currentRound = 0; currentRound < AMOUNT_OF_ROUNDS; currentRound++) {
            int number = getRandomInt(LOWER_LIMIT, UPPER_LIMIT);
            answersQuestions[currentRound][question] = String.valueOf(number);
            answersQuestions[currentRound][answer] = isNumberEven(number) ? "yes" : "no";
        }

        Engine.run(answersQuestions, gameObjective);
    }
}
