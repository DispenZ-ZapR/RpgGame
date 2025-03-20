package Characters.VilliamEntity.VilliamEntity;

import Characters.VilliamEntity.PlayerEntity.PlayerType;

import java.util.Random;

public class Goblin extends VilliamStatistic{
    public Goblin(int heatlh, int damage, int stamina, PlayerType type, int id) {
        super(40, 30, 50, TypeVilliam.GOBLIN, 2);
    }
    void display() {
        System.out.println("heatlh: " + heatlh + " damage: " + damage + " stamina: " + stamina);
    }

    @Override
    int attack() {
        if(!(stamina <= 5)) {
            Random r = new Random();
            int attackDamage = damage + r.nextInt(7);
            stamina -= 5;
            return attackDamage;
        }else{
            stamina += 7;
            System.out.println("Гоблин решил восстановится!");
            return 0;
        }
    }
}
