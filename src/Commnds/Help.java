package Commnds;

import java.util.Collection;

public class Help implements Command {
    private Collection<Command> commands;

    public Help(Collection<Command> commands) {
        this.commands = commands;
    }
    @Override
    public void execute() {
        for(Command l : commands) {
            System.out.println(l);
        }
    }

    @Override
    public String toString() {
        return "Help-вывод всех команд";
    }
}
