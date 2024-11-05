package hexlet.code;

import java.util.Random;

public class GCD {

    private static final int UPPER_LIMIT = 100;
    private static final int AMOUNT_OF_ROUNDS = 3;

    public static void main(String[] args) {
        int question = 0;
        int answer = 1;
        String gameObjective = "Find the greatest common divisor of given numbers.";
        Random rand = new Random();
        String[][] answersQuestions = new String[AMOUNT_OF_ROUNDS][2];

        for (int currentRound = 0; currentRound < AMOUNT_OF_ROUNDS; currentRound++) {
            int numb1 = rand.nextInt(UPPER_LIMIT) + 1;
            int numb2 = rand.nextInt(UPPER_LIMIT) + 1;
            answersQuestions[currentRound][question] = numb1 + " " + numb2;

            while (numb1 != numb2) {
                if (numb1 > numb2) {
                    numb1 = numb1 - numb2;
                } else {
                    numb2 = numb2 - numb1;
                }
            }

            answersQuestions[currentRound][answer] = String.valueOf(numb1);
        }

        Engine.run(answersQuestions, gameObjective);
    }
}
