package Commands;

import java.util.Map;

public class CommandGeneral {
    private Map<String, Command> commandsSystem;

    public CommandGeneral(Map<String, Command> commandsSystem) {
        this.commandsSystem = commandsSystem;
    }

    public void commandExecuted(String userCommand){
        String commandName = userCommand.toLowerCase();
        if(commandsSystem.containsKey(commandName)){
            Command command = commandsSystem.get(commandName);
            command.execute();
        }else {
            System.out.println("Command not found");
        }
    }
}
