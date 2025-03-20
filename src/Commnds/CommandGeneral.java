package Commnds;

import java.util.Map;

public class CommandGeneral {
    private Map<String, Command> commandsSystem;

    public CommandGeneral(Map<String, Command> commandsSystem) {
        this.commandsSystem = commandsSystem;
    }

    public void commandExecuted(String userCommand){
        if(commandsSystem.containsKey(userCommand)){
            Command command = commandsSystem.get(userCommand);
            command.execute();
        }else {
            System.out.println("Command not found");
        }
    }
}
