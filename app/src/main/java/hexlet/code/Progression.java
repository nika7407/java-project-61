package hexlet.code;

import java.util.Random;

public class Progression {

    private static final int UPPER_LIMIT_START = 100;
    private static final int UPPER_LIMIT_STEP = 10;
    private static final int MIN_LENGTH = 6;
    private static final int AMOUNT_OF_ROUNDS = 3;
    private static final int MAX_LENGTH = 6;

    public static void main(String[] args) {
        int question = 0;
        int answer = 1;
        String gameObjective = "What number is missing in the progression?";
        String[][] answersQuestions = new String[AMOUNT_OF_ROUNDS][2];
        Random rand = new Random();

        for (int currentRound = 0; currentRound < AMOUNT_OF_ROUNDS; currentRound++) {
            int start = rand.nextInt(UPPER_LIMIT_START) + 1;
            int step = rand.nextInt(UPPER_LIMIT_STEP) + 1;
            int length = rand.nextInt(MAX_LENGTH) + MIN_LENGTH;  // Ensures length is between 6 and 11
            int empty = rand.nextInt(length);  // Random index to hide in the progression

            int[] progression = new int[length];
            answersQuestions[currentRound][question] = "";

            // Generate the progression
            for (int k = 0; k < length; k++) {
                progression[k] = start + (step * k);
            }

            // Set the answer (the missing number in the progression)
            answersQuestions[currentRound][answer] = String.valueOf(progression[empty]);

            // Create the question with the missing number
            for (int m = 0; m < progression.length; m++) {
                if (m != empty) {
                    answersQuestions[currentRound][question] += progression[m] + " ";
                } else {
                    answersQuestions[currentRound][question] += ".. ";
                }
            }
        }

        Engine.run(answersQuestions, gameObjective);
    }
}
