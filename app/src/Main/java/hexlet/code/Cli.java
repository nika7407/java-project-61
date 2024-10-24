package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static void greet(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input your name and press enter:");
        String name = userInput.next();
        System.out.println("Hello, "+name+"!");
        userInput.close();
    }
}
