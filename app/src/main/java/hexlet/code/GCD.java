package hexlet.code;

import java.util.Random;

public class GCD {
    public static void main(String[] args) {
        int question = 0;
        int answer = 1;
        int upperLimit = 100;
        int amountOfRounds = 3;
        String gameObjective = "Find the greatest "
                + "common divisor of given numbers.";
        Random rand = new Random();
        String[][] answersQuestions = new String[amountOfRounds][2];

        for (int currendRound = 0;
             currendRound < amountOfRounds;
             currendRound++) {
            int numb1 = rand.nextInt(upperLimit) + 1;
            int numb2 = rand.nextInt(upperLimit) + 1;
            // +1 ensures that limit is not going to be zero
            answersQuestions[currendRound][question] = numb1 + " " + numb2;

            while (numb1 != numb2) {
                if (numb1 > numb2) {
                    numb1 = numb1 - numb2;
                } else {
                    numb2 = numb2 - numb1;
                }
            }

            answersQuestions[currendRound][answer] = String.valueOf(numb1);

        }
        Engine.Run(answersQuestions, gameObjective);
    }
}

