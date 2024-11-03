package hexlet.code;

import java.util.Random;

public class Progression {
    public static void main(String[] args) {

        String gameObjective = "What number is missing in the progression?";

        Random rand = new Random();
        String[][] answersQuestions = new String[3][2];


        for (int i = 0; i < 3; i++) {
            int start = rand.nextInt(101);
            int step = rand.nextInt(10) + 1;
            int randomInt = rand.nextInt(6)+6;
            int empty = rand.nextInt(randomInt-1)+1;

            int[] givenString = new int[randomInt];
            answersQuestions[i][0] = "";
            for (int k = 0; k < randomInt; k++) {

                    givenString[k] = (start + (step * k));

            }
            answersQuestions[i][1] = String.valueOf(givenString[empty]);

            for (int m = 0; m < givenString.length; m++) {
               if(m != empty) {
                    answersQuestions[i][0] += givenString[m];
                    if (m < givenString.length - 1) {
                        answersQuestions[i][0] += " ";
                    }
                }else {
                   answersQuestions[i][0] += ".. ";
               }
            }




        }

        Engine.Run(answersQuestions, gameObjective);

    }
}
