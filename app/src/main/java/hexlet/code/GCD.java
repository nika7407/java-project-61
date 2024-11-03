package hexlet.code;

import java.util.Random;

public class GCD {
    public static void main(String[] args) {

        String gameObjective = "Find the greatest common divisor of given numbers.";
        Random rand = new Random();
        String[][] answersQuestions = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int numb1 = rand.nextInt(100) + 1;
            int numb2 = rand.nextInt(100) + 1;
            answersQuestions[i][0] = numb1 + " " + numb2;

            while (numb1 != numb2) {
                if (numb1 > numb2) {
                    numb1 = numb1 - numb2;
                } else {
                    numb2 = numb2 - numb1;
                }
            }

            answersQuestions[i][1] = String.valueOf(numb1);

        }
        Engine.Run(answersQuestions, gameObjective );
    }
}

