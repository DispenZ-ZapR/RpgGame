package Commnds;

import UserData.Data;
import UserData.User;

import java.util.Scanner;

public class Register implements Command {
    Data data = null;
    User user = null ;
    Scanner scanner = new Scanner(System.in);
    boolean inLogged = false;
    @Override
    public void execute() {
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        user = new User(name, password);
        data.addUser(user);
        System.out.println("Успешная регистрация!");
        inLogged = true;
    }
    public boolean CheckReg(){
        return inLogged;
    }

    @Override
    public String toString() {
        return "Register - Регистрация";
    }
}
