package hexlet.code;
public class App {
    public static void main(String[] args) {
        System.out.println("--------\n| MENU | \n--------\nto start please enter corresponding number:\n1 - Greet\n2 - IsEven\n0 - Exit");
        while (true) {
           switch (Cli.numberInput()) {
               case 1:
                   System.out.println("Welcome to the Brain Games!");
                   String name = Cli.greet();
                   System.out.println(name + " please choose the game and type corresponding number:");
                   App.main(args);
                   break;

               case 2:
                   isEven.main(args);
                   break;

               case 0:
                   System.out.println("Goodbye!");
                   return;

               default:
                   System.out.println("Wrong input!");
                   break;
           }
       }




    }

}
