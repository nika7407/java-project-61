package hexlet.code;
import java.util.Scanner;
import java.util.Random;
public class isEven {
    public static void main(String[] args) {
        String name = Cli.greet();
        System.out.println("\nAnswer 'yes' if the number is even, otherwise answer 'no'.");
        int rightAnswer = 0;
        Random random = new Random();

        while (rightAnswer<3){
            String answer;
            int number = random.nextInt(101);
            System.out.println(number+" is it even?");

            if (number % 2 == 0){
                answer = "yes";
            } else {
                answer = "no";
            }

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.toLowerCase().equals(answer)){
             rightAnswer++;
             System.out.println("Answer: " +input+ "\nCorrect!");
            }else{
                System.out.println("Answer: " +input+ "\nWrong!\ncorrect answer: "+answer);
                rightAnswer=0;
                System.out.println("you're wrong,"+name+" Better luck next time!\n");
                System.out.println("--------\n| MENU | \n--------\nto start please enter corresponding number:\n1 - Greet\n2 - IsEven\n0 - Exit");
                return;
            }

        }
        if (rightAnswer ==3){
            System.out.println("Congratulations "+name+" you won!");
            App.main(args);
        }
    }
}
