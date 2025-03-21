package Commnds;

import Characters.VilliamEntity.PlayerEntity.*;
import Characters.VilliamEntity.VilliamEntity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Start implements Command {
    Scanner sc = new Scanner(System.in);
    PlayerType playerType;
    Random rand = new Random();
    EntityStatistic player = null;
    VilliamStatistic villiam = null;
    List<VilliamStatistic> villiamStorage = new ArrayList<>();
    @Override
    public void execute() {
        System.out.println("Выберите класс персонажа");
        System.out.println("1)"+PlayerType.WARRIOR.toString() + " 2)" + PlayerType.ALEKSANDR + " 3)" + PlayerType.WIZARD);
        int choice = sc.nextInt();
        villiamStorage.add(new Barbarian(80,80,60,1));
        villiamStorage.add(new Goblin(40,30,50, TypeVilliam.GOBLIN,1));
        villiamStorage.add(new DeadWarrior(60,70,70, TypeVilliam.DEAD_WARRIOR,3));
        VilliamStatistic randomVilliam = villiamStorage.get(rand.nextInt(villiamStorage.size()));
        switch (choice) {
            case 1:
                player = new Warrior(60,60, 60,1);
                break;
            case 2:
                player = new Aleksandr(100,100,100,2);
                break;
            case 3:
                player = new Wizard(40,70,60,3);
                break;
        }
        while(player.isAlive() && randomVilliam.isAlive()) {
            System.out.println(randomVilliam.display());
            System.out.println("1)Атака \n" +
                    "2)Восстановление \n" +
                    "3)Навык ");
            player.display();
            int choice2 = sc.nextInt();
            switch (choice2) {
                case 1:
                    randomVilliam.takeDamage(player.attack());
                    player.takeDamage(randomVilliam.attack());
                    break;
                case 2:
                    player.Recovery();
                    player.takeDamage(randomVilliam.attack());
                    break;
                case 3:
                    player.skill();
                    player.takeDamage(randomVilliam.attack());
                    break;
            }
        }
    }
}