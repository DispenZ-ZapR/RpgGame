package Commnds;

import Characters.PlayerEntity.*;
import Characters.VilliamEntity.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Start implements Command {
    PlayerType type;
    EntityStatistic entity;
    boolean pLayerLivechecker = true;
    boolean villiamLivechecker = true;
    VilliamStatistic villiam;

    Random rand = new Random();

    Scanner sc = new Scanner(System.in);

    @Override
    public void execute() {
        
    }

    public void checker(){
        if (entity.isAlive()){
           pLayerLivechecker = true;
        }else {
            System.out.println("Вы пройграли!");
            pLayerLivechecker = false;
        }
    }
    public void villiamChecker(){
        if (entity.isAlive()){
            villiamLivechecker = true;
        }else {
            System.out.println("Монстр побежден!");
            villiamLivechecker = false;
        }

    }
    public void attack(){
        villiam.takeDamage(entity.getDamage());
        entity.takeDamage(villiam.attack());

    }
    public void recovery(){
        entity.Recovery();
        entity.takeDamage(randomvilliam().attack());
    }
    public void skill(){
        entity.skill();
        entity.takeDamage(randomvilliam().attack());
    }

    public VilliamStatistic randomvilliam(){
        List<VilliamStatistic> mobs = new ArrayList<VilliamStatistic>();
        mobs.add(new Barbarian());
        mobs.add(new DeadWarrior());
        mobs.add(new Goblin());
        villiam = mobs.get(rand.nextInt(mobs.size()));
        return villiam;
    }
}