package hexlet.code;

import java.util.Random;

public class IsEven {
    public static void main(String[] args) {
        int question = 0;
        int answer = 1;
        int amountOfRounds = 3;
        int upperLimit = 100;

        String gameObjective = ("Answer 'yes' if the number "
                + "is even, otherwise answer 'no'.");
        String[][] answersQuestions = new String[amountOfRounds][2];
        Random random = new Random();

        for (int currentRound = 0;
             currentRound < amountOfRounds;
             currentRound++) {

            int number = random.nextInt(upperLimit) + 1;
            // +1 ensures that limit is not going to be zero
            answersQuestions[currentRound][question] = String.valueOf(number);
            if (number % 2 == 0) {
                answersQuestions[currentRound][answer] = "yes";
            } else {
                answersQuestions[currentRound][answer] = "no";

            }


        }

        Engine.Run(answersQuestions, gameObjective);

    }
}
