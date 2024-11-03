package hexlet.code;

import java.util.Random;

public class IsEven {
    public static void main(String[] args) {

        String gameObjective = ("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String[][] answersQuestions = new String[3][2];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {

            int number = random.nextInt(100)+1;
            answersQuestions[i][0] = String.valueOf(number);

            if (number % 2 == 0) {
                answersQuestions[i][1] = "yes";
            } else {
                answersQuestions[i][1] = "no";

            }


        }

        Engine.Run(answersQuestions, gameObjective);

    }
}
