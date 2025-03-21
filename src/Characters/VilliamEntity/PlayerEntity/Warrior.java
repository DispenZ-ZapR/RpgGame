package Characters.VilliamEntity.PlayerEntity;

import java.util.Random;

public class Warrior extends EntityStatistic{
    public Warrior(int heatlh, int damage, int stamina, int id) {
        super(60, 60, 60, PlayerType.WARRIOR, 2);
    }
    boolean shield = false;
    
    @Override
    void skill() {
        if (stamina > 20) {
            shield = true;
            System.out.println("Вы использовали навык! Щит-блокирует 1 удар врага, снимает -20 выносливости");
            stamina -= 20;
        }else {
            System.out.println("Не достаточно выносливости!");
        }
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
