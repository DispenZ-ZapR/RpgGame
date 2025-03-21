package Characters.VilliamEntity.PlayerEntity;

import java.util.Random;

public class Wizard extends EntityStatistic{
    public Wizard(int heatlh, int damage, int stamina, int id) {
        super(40, 70, 60, PlayerType.WIZARD, 3);

    }

    @Override
    public void skill() {

    }

    @Override
    public void takeDamage(int damage) {
        heatlh -= damage;
        System.out.println("Вы получили урон: " +"-" + damage);
    }

    @Override
    public int attack() {
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

    @Override
    public void display() {
        System.out.println("Класс: Маг");
        System.out.println("heatlh: " + heatlh + " damage: " + damage + " stamina: " + stamina);
    }
}
