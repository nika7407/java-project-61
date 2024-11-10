package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.getRandomInt;

public class Prime {

    private static final int UPPER_LIMIT = 100;
    private static final int AMOUNT_OF_ROUNDS = 3;
    private static final int LOWER_LIMIT = 1;
    public static void Prime(String[] args) {
        int question = 0;
        int answer = 1;
        String gameObjective = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] answersQuestions = new String[AMOUNT_OF_ROUNDS][2];

        for (int currentRound = 0; currentRound < AMOUNT_OF_ROUNDS; currentRound++) {
            int number = getRandomInt(LOWER_LIMIT, UPPER_LIMIT);
            answersQuestions[currentRound][question] = String.valueOf(number);

            if (number <= 1) {
                answersQuestions[currentRound][answer] = "no";
            } else {
                boolean isPrime = true;
                for (int k = 2; k < number; k++) {
                    if (number % k == 0) {
                        isPrime = false;
                        break;
                    }
                }
                answersQuestions[currentRound][answer] = isPrime ? "yes" : "no";
            }
        }

        Engine.run(answersQuestions, gameObjective);
    }
}
