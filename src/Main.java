import Commnds.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Command> command = new HashMap<>();
        command.put("help", new Help(command.values()));
        command.put("stop", new Exit());
        command.put("start", new Start());
        command.put("register", new Register());
        command.put("exit", new Exit());
        CommandGeneral commandHandler = new CommandGeneral(command);


        RpgGameApplication game = new RpgGameApplication(
                commandHandler);
        game.run();
    }

}