package Commands;

import UserData.Data;
import UserData.User;

import java.util.HashMap;
import java.util.Map;

public class accountStatusCheck implements Command {
    @Override
    public void execute() {
        Map<String, Command> command = new HashMap<>();
        command.put("start", new Start());
        CommandGeneral commands = new CommandGeneral(command);
        Data data = Data.getInstance();
        if(data.getCurrentUserName() != null){
           commands.commandExecuted("start");
        }else System.out.println("Вы не зарегестрированы!");
    }
}
