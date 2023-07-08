import java.util.Scanner;

public class TextUI {


    private SimpleDictionary simpleDictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.simpleDictionary = simpleDictionary;
        this.scanner = scanner;

    }


    public void start( ) {

        System.out.println("Command:");

        String command = scanner.nextLine();

        System.out.print(command);

        if (command.equals("end")) {
            System.out.println("Bye bye!");
        } else {
            System.out.println("Unknown command");
        }


    }



}
