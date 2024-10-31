package hexlet.code;
public class App {
    public static void main(String[] args) {
        Cli.printMenu();
        while (true) {
            int choice = Cli.numberInput();
            switch (choice) {
                case 1:
                    System.out.println("Welcome to the Brain Games!");
                    String name = Cli.greet();
                    System.out.println(name + " please choose the game and type corresponding number:");
                    break;

                case 2:
                    isEven.main(args);
                    break;

                case 3:
                    Calc.main(args);
                    break;

                case 4:
                    GCD.main(args);
                    break;

                case 5:
                    Progression.main(args);
                    break;

                case 6:
                    Prime.main(args);
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