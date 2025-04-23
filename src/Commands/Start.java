package Commands;

import Characters.PlayerEntity.*;
import Characters.VilliamEntity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Start implements Command {
    EntityStatistic player = null;
    VilliamStatistic villiam = null;
    Random rand = new Random();
    Scanner sc = new Scanner( System.in );

    boolean VilliamLive = true;
    boolean PlayerLive = true;
    @Override
    public void execute() {
        villiam = getVilliam();
        System.out.println("Выберите персонажа");
        PlayerType.getDescription();
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                player = new Warrior();
                break;
            case 2:
                player = new Aleksandr();
                break;
            case 3:
                player = new Wizard();
                break;
            case 4:
                player = new Steve();
                break;
            default:
                System.out.println("Неверное значение");
                break;
        }
        while (VilliamLive && PlayerLive) {
            actionTable();
        }
    }
    private void attack(){
        villiam.takeDamage(player.attack());
        player.takeDamage(villiam.attack());
        PlayerChecker();
        VilliamChecker();
    }
    private void skill(){
        player.skill();
        player.takeDamage(villiam.attack());
        PlayerChecker();
        VilliamChecker();
    }
    private void recovery(){
        player.Recovery();
        player.takeDamage(villiam.attack());
        PlayerChecker();
        VilliamChecker();
    }
    private VilliamStatistic getVilliam(){
        List<VilliamStatistic>dataVilliam = new ArrayList<>();
        dataVilliam.add(new Barbarian());
        dataVilliam.add(new DeadWarrior());
        dataVilliam.add(new Goblin());
        return dataVilliam.get(rand.nextInt(dataVilliam.size()));
    }
    private void VilliamChecker(){
        if(!villiam.isAlive()){
            VilliamLive = false;
            System.out.println("Враг побежден");
        }
    }
    private void PlayerChecker(){
        if(!player.isAlive()){
            PlayerLive = false;
            System.out.println("Вы пройграли!");
        }
    }
    private void actionTable(){
        villiam.display();
        System.out.println("1)Атака " +
                "2)Скилл " +
                "3)Восстановление ");
        player.display();
        int action = sc.nextInt();
        switch (action){
            case 1:
                attack();
                break;
            case 2:
                skill();
                break;
            case 3:
                recovery();
                break;
            default:
                System.out.println("Неверное значение");
        }

    }

    @Override
    public String toString() {
        return "Start-начать игру";
    }
}
