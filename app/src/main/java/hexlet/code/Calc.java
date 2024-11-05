package hexlet.code;

import java.util.Random;

public class Calc {
    public static void main(String[] args) {
        int switchCaseForOperators = 3;
        int question = 0;
        int answer = 1;
        int amountOfRounds = 3;
        int upperLimit = 20;
        // variables
        String gameObjective = "What is the result of the expression?";
        Random rand = new Random();
        String[][] answersQuestions = new String[amountOfRounds][2];

        for (int i = 0; i < amountOfRounds; i++) {
            int number1 = rand.nextInt(upperLimit) + 1;
            int number2 = rand.nextInt(upperLimit) + 1;
            // +1 in the end ensures that output is not going to be 0
            int operatorVariable = rand.nextInt(switchCaseForOperators);


            switch (operatorVariable) {

                case 0:
                    answersQuestions[i][answer] = String.valueOf(number1 + number2);
                    answersQuestions[i][question] = number1 + " + " + number2;
                    break;

                case 1:
                    answersQuestions[i][answer] = String.valueOf(number1 - number2);
                    answersQuestions[i][question] = number1 + " - " + number2;
                    break;

                case 2:
                    answersQuestions[i][answer] = String.valueOf(number1 * number2);
                    answersQuestions[i][question] = number1 + " * " + number2;
                    break;

                default:
                    System.out.println("Something went very wrong ");
                    break;
            }


            }

        Engine.Run(answersQuestions, gameObjective);

        }
}



