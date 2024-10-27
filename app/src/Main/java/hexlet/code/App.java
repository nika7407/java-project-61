package hexlet.code;
public class App {
    public static void main(String[] args) {
       Cli.printMenu();
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

               case 3:
                   Calc.main(args);
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
