package Commnds;

import Characters.VilliamEntity.PlayerEntity.*;
import Characters.VilliamEntity.VilliamEntity.TypeVilliam;
import Characters.VilliamEntity.VilliamEntity.VilliamStatistic;

import java.util.AbstractList;
import java.util.Scanner;

public class Start implements Command {
    Scanner sc = new Scanner(System.in);
    PlayerType playerType;
    EntityStatistic player = null;
    VilliamStatistic villiam = null;
    @Override
    public void execute() {
        System.out.println("Выберите класс персонажа");
        System.out.println("1)"+PlayerType.WARRIOR.toString() + " 2)" + PlayerType.ALEKSANDR + " 3)" + PlayerType.WIZARD);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                player = new Warrior(60,60, 60,1);
                player.display();
                break;
            case 2:
                player = new Aleksandr(100,100,100,2);
                player.display();
                break;
            case 3:
                player = new Wizard(40,70,60,3);
                player.display();
                break;
        }


    }
}