package hexlet.code;

import java.util.Random;

public class Prime {
    public static void main(String[] args) {

        String[][] answersQuestions = new String[3][2];

        Random random = new Random();
        String gameObjective = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < 3; i++) {


            int number = random.nextInt(100) + 1;
            answersQuestions[i][0] = String.valueOf(number);
            if (number < 2) {
                answersQuestions[i][1] = "no";
            } else {
                for (int k = 2; k < number; k++) {
                    if (number % k == 0) {
                        answersQuestions[i][1] = "no";
                        break;
                    } else {answersQuestions[i][1] = "yes";}
                }
            }

        }

       Engine.Run(answersQuestions, gameObjective);

    }

}
