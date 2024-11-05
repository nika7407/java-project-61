package hexlet.code;

import java.util.Random;

public class Progression {
    public static void main(String[] args) {
        int question = 0;
        int answer = 1;
        int amountOfRounds = 3;
        int upperLimitStart = 100;
        int upperLimitStep = 10;
        int lengthAmount = 6;
        String gameObjective = "What number is missing in the progression?";
        Random rand = new Random();
        String[][] answersQuestions = new String[amountOfRounds][2];
        for (int currentRound = 0;
             currentRound < amountOfRounds;
             currentRound++) {
            int start = rand.nextInt(upperLimitStart) + 1;
            int step = rand.nextInt(upperLimitStep) + 1;
            int length = rand.nextInt(lengthAmount) + 6;
            int empty = rand.nextInt(length - 1) + 1;
            // +1 ensures that it doesnt starts from 0
            // +6 ensures that diapason is from 6 to lengthamount+6

            int[] givenString = new int[length];
            answersQuestions[currentRound][question] = "";
            for (int k = 0; k < length; k++) {

                    givenString[k] = (start + (step * k));

            }
            answersQuestions[currentRound][answer] = String.valueOf(givenString[empty]);

            for (int m = 0; m < givenString.length; m++) {
               if (m != empty) {
                    answersQuestions[currentRound][question] += givenString[m];
                    if (m < givenString.length - 1) {
                        answersQuestions[currentRound][question] += " ";
                    }
                } else {
                   answersQuestions[currentRound][question] += ".. ";
               }
            }




        }

        Engine.Run(answersQuestions, gameObjective);

    }
}
