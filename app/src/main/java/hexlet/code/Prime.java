package hexlet.code;

import java.util.Random;

public class Prime {
    public static void main(String[] args) {
        int question = 0;
        int answer = 1;
        int amountOfRounds = 3;
        int upperLimit = 100;
        String[][] answersQuestions = new String[amountOfRounds][2];
        Random random = new Random();
        String gameObjective = "Answer 'yes' if given"
              + " number is prime. Otherwise answer 'no'.";
        for (int currentRound = 0; currentRound < amountOfRounds; currentRound++) {
            int number = random.nextInt(upperLimit) + 1;
            answersQuestions[currentRound][question] = String.valueOf(number);
            if (number <= 1) {
                answersQuestions[currentRound][answer] = "no";
            } else {
                for (int k = 2; k < number; k++) {
                    if (number % k == 0) {
                        answersQuestions[currentRound][answer] = "no";
                        break;
                    } else {
                        answersQuestions[currentRound][answer] = "yes";
                    }
                }

            }

        }

        Engine.Run(answersQuestions, gameObjective);

    }

}