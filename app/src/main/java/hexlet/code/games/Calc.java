package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.getRandomInt;

public class Calc {

    private static final int OPERATOR_COUNT = 2;
    private static final int UPPER_LIMIT = 20;
    private static final int ADD_OPERATOR = 0;
    private static final int SUBTRACT_OPERATOR = 1;
    private static final int MULTIPLY_OPERATOR = 2;
    private static final int AMOUNT_OF_ROUNDS = 3;
    private static final int LOWER_LIMIT = 1;

    public static int calculateAnswer(int number1, int number2, int operatorVariable) {
        switch (operatorVariable) {
            case ADD_OPERATOR:
                return number1 + number2;

            case SUBTRACT_OPERATOR:
                return number1 - number2;

            case MULTIPLY_OPERATOR:
                return number1 * number2;

            default:
                System.out.println("Something went VERY wrong");
                return 0;
        }
    }

    public static void game() {
        int question = 0;
        int answer = 1;
        String gameObjective = "What is the result of the expression?";
        String[][] answersQuestions = new String[AMOUNT_OF_ROUNDS][2];

        for (int i = 0; i < AMOUNT_OF_ROUNDS; i++) {
            int number1 = getRandomInt(LOWER_LIMIT, UPPER_LIMIT);
            int number2 = getRandomInt(LOWER_LIMIT, UPPER_LIMIT);
            int operatorVariable = getRandomInt(0, OPERATOR_COUNT);
            char[] operator = {'+', '-', '*'};

            answersQuestions[i][question] = number1 + " " + operator[operatorVariable] + " " + number2;
            answersQuestions[i][answer] = String.valueOf(calculateAnswer(number1, number2, operatorVariable));
        }

        Engine.run(answersQuestions, gameObjective);
    }
}
