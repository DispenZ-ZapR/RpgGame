package Commnds;

import UserData.Data;
import UserData.User;

import java.util.Scanner;

public class Register implements Command {
    Data data;
    User user;
    Scanner scanner = new Scanner(System.in);
    @Override
    public void execute() {
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        user = new User(name, password);
        data.addUser(user);
    }
}
