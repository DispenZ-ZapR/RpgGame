package Commands;

import java.util.Scanner;

public class RpgGameApplication {
    private CommandGeneral commandHandler;

    public RpgGameApplication(CommandGeneral commandHandler) {
        this.commandHandler = commandHandler;
    }
    Scanner scanner = new Scanner(System.in);

    public void run(){
        System.out.println("Game Started");
        while (true){
            System.out.println("Введите команду");
            String userCommand = scanner.nextLine();
            commandHandler.commandExecuted(userCommand);
        }


    }
}
