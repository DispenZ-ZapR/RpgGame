package Characters.PlayerEntity;

import java.util.Random;

public class Aleksandr extends EntityStatistic{
    public Aleksandr(int heatlh, int damage, int stamina, int id) {
        super(100, 100, 100, PlayerType.ALEKSANDR );
    }

    @Override
    public void skill() {
        System.out.println("Вы использовали навык! Уничтожитель-ваш урон увеличивается на +100");
        damage += 100;
    }

    public Aleksandr() {
        super(100, 100, 100, PlayerType.WARRIOR);
    }

    @Override
    public int attack() {
        if (!(stamina < 40)) {
            System.out.println("Вы нанесли удар: " + damage);
            Random r = new Random();
            int dam = damage + r.nextInt(7);
            stamina -= 40;
            System.out.println("Вы нанесли удар: -" + dam);
            return dam;
        }else{
            System.out.println("Персонаж слишком устал!");
            return 0;
        }

    }

    @Override
    public void takeDamage(int damage) {
        heatlh -= damage;
        System.out.println("Вы получили урон: " +"-" + damage);
    }

    @Override
    public void Recovery() {
        System.out.println("Восстановление!!!! +100");
        stamina += 100;
    }

    @Override
    public void display() {
        System.out.println("Класс: Александр");
        System.out.println("heatlh: " + heatlh + " damage: " + damage + " stamina: " + stamina);
    }
}
