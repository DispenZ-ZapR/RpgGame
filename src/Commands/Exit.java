package Commands;

public class Exit implements Command {
    @Override
    public void execute() {
        System.exit(0);
    }

    @Override
    public String toString() {
        return "Exit-выход с программы";
    }
}
