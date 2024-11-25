package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.getRandomInt;

public class Progression {

    private static final int UPPER_LIMIT_START = 100;
    private static final int UPPER_LIMIT_STEP = 10;
    private static final int MIN_LENGTH = 6;
    private static final int AMOUNT_OF_ROUNDS = Engine.ROUNDS;
    private static final int MAX_LENGTH = 12;
    private static final int LOWER_LIMIT_STEP = 1;
    private static final int LOWER_LIMIT_START = 1;

    public static String[] generateProgression(int start, int step, int length) {
        String[] progression = new String[length];
        // Generate the progression
        for (int k = 0; k < length; k++) {
            progression[k] = Integer.toString(start + (step * k));
        }
        return progression;
    }

    public static void game() {
        int question = 0;
        int answer = 1;
        String gameObjective = "What number is missing in the progression?";
        String[][] answersQuestions = new String[AMOUNT_OF_ROUNDS][2];

        for (int currentRound = 0; currentRound < AMOUNT_OF_ROUNDS; currentRound++) {
            int start = getRandomInt(LOWER_LIMIT_START, UPPER_LIMIT_START);
            int step = getRandomInt(LOWER_LIMIT_STEP, UPPER_LIMIT_STEP);
            int length = getRandomInt(MIN_LENGTH, MAX_LENGTH);  // Ensures length is between 6 and 11
            int empty = getRandomInt(0, length - 1);  // Random index to hide in the progression meow

            String[] progression = generateProgression(start, step, length);
            // Set the answer (the missing number in the progression)
            answersQuestions[currentRound][answer] = progression[empty];
            progression[empty] = "..";
            answersQuestions[currentRound][question] = String.join(" ", progression);
            // Create the question with the missing number meow
        }
        Engine.run(answersQuestions, gameObjective);
    }
}
