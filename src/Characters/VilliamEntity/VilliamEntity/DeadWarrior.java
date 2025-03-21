package Characters.VilliamEntity.VilliamEntity;

import java.util.Random;

public class DeadWarrior extends VilliamStatistic{
    @Override
    int attack() {
        if(!(stamina < 10)) {
            Random r = new Random();
            int attackDamage = damage + r.nextInt(7);
            stamina -= 10;
            return attackDamage;
        }else{
            stamina += 7;
            System.out.println("Рыцарь решил восстановится!");
            return 0;
        }
    }

    public DeadWarrior(int heatlh, int damage, int stamina, int id) {
        super(60, 70, 70, TypeVilliam.DEAD_WARRIOR, 1);
    }

}
