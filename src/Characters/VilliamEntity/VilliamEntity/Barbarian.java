package Characters.VilliamEntity.VilliamEntity;

import java.util.Random;

public class Barbarian extends VilliamStatistic {
    public Barbarian(int heatlh, int damage, int stamina, int id) {
        super(80, 80, 60, TypeVilliam.BARBARIAN, 1);
    }

    @Override
    int attack() {
        if (!(stamina < 10)) {
            Random r = new Random();
            int attackDamage = damage + r.nextInt(7);
            stamina -= 10;
            return attackDamage;
        } else {
            stamina += 7;
            System.out.println("Варвар решил восстановится!");
            return 0;
        }
    }
}

