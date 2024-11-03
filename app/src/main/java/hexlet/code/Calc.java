package hexlet.code;

import java.util.Random;

public class Calc {
    public static void main(String[] args) {

        String gameObjective = "What is the result of the expression?";

        Random rand = new Random();
        String[][] answersQuestions = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int number1 = rand.nextInt(20)+1;
            int number2 = rand.nextInt(20)+1;
            int operatorVariable = rand.nextInt(3);


            switch (operatorVariable) {

                case 0:
                    answersQuestions[i][1] = String.valueOf(number1 + number2);
                    answersQuestions[i][0] = number1 + " + " + number2;
                    break;

                case 1:
                    answersQuestions[i][1] = String.valueOf(number1 - number2);
                    answersQuestions[i][0] = number1 + " - " + number2;
                    break;

                case 2:
                    answersQuestions[i][1] = String.valueOf(number1 * number2);
                    answersQuestions[i][0] = number1 + " * " + number2;
                    break;

                default:
                    System.out.println("Something went very wrong ");
                    break;
            }


            }

        Engine.Run(answersQuestions, gameObjective);

        }
}



