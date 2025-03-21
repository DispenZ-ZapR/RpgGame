package Characters.VilliamEntity.PlayerEntity;

import java.util.Random;

public class Wizard extends EntityStatistic{
    public Wizard(int heatlh, int damage, int stamina, PlayerType type, int id) {
        super(40, 70, 60, PlayerType.WIZARD, 3);

    }

    @Override
    void skill() {

    }

    @Override
    int attack() {
        if (!(stamina < 10)) {
            Random r = new Random();
            int dam = damage + r.nextInt(7);
            stamina -= 10;
            return dam;
        }else{
            System.out.println("Персонаж слишком устал!");
            return 0;
        }
    }
}
