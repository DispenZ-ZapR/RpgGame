package Characters.VilliamEntity.PlayerEntity;

import java.util.Random;

public class Aleksandr extends EntityStatistic{
    public Aleksandr(int heatlh, int damage, int stamina, int id) {
        super(100, 100, 100, PlayerType.ALEKSANDR, 1 );
    }
    void display() {
        System.out.println("heatlh: " + heatlh + " damage: " + damage + " stamina: " + stamina);
    }

    @Override
    void skill() {
        System.out.println("Вы использовали навык! Уничтожитель-ваш урон увеличивается на +100");
        damage += 100;
    }

    @Override
    public int attack() {
        if (!(stamina < 40)) {
            Random r = new Random();
            int dam = damage + r.nextInt(7);
            stamina -= 40;
            return dam;
        }else{
            System.out.println("Персонаж слишком устал!");
            return 0;
        }

    }
}
