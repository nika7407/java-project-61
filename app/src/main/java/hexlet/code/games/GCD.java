package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.getRandomInt;

public class GCD {
    private static final int UPPER_LIMIT = 100;
    private static final int LOWER_LIMIT = 1;
    private static final int AMOUNT_OF_ROUNDS = Engine.ROUNDS;

    public static int findGDC(int number1, int number2) {
       int numb1 = number1;
       int numb2 = number2;
        while (numb1 != numb2) {
            if (numb1 > numb2) {
                numb1 = numb1 - numb2;
            } else {
                numb2 = numb2 - numb1;
            }
        }
        return numb1;
    }
    public static void game() {
        int question = 0;
        int answer = 1;
        String gameObjective = "Find the greatest common divisor of given numbers.";
        String[][] answersQuestions = new String[AMOUNT_OF_ROUNDS][2];

        for (int currentRound = 0; currentRound < AMOUNT_OF_ROUNDS; currentRound++) {
            int numb1 = getRandomInt(LOWER_LIMIT, UPPER_LIMIT);
            int numb2 = getRandomInt(LOWER_LIMIT, UPPER_LIMIT);
            answersQuestions[currentRound][question] = numb1 + " " + numb2;
            answersQuestions[currentRound][answer] = String.valueOf(findGDC(numb1, numb2));
        }

        Engine.run(answersQuestions, gameObjective);
    }
}
