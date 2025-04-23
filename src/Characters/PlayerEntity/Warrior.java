package Characters.PlayerEntity;

import java.util.Random;

public class Warrior extends EntityStatistic{
    public Warrior(int heatlh, int damage, int stamina, int id) {
        super(100, 65, 60, PlayerType.WARRIOR);
    }
    int counter = 0;
    @Override
    public void skill() {
        if (stamina > 20) {
            System.out.println("Вы использовали навык! Щит-блокирует 2 удара врага, снимает -20 выносливости");
            stamina -= 20;
            counter += 2;
        }else {
            System.out.println("Не достаточно выносливости!");
        }
    }

    public Warrior() {
        super(100, 65, 60, PlayerType.WARRIOR);
    }

    @Override
    public int attack() {
        if (!(stamina < 10)) {
            Random r = new Random();
            int dam = damage + r.nextInt(7);
            stamina -= 10;
            System.out.println("Вы нанесли удар: -" + dam);
            return dam;

        }else{
            System.out.println("Персонаж слишком устал!");
            return 0;
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (!(counter > 0)) {
            heatlh -= damage;
            System.out.println("Вы получили урон: " +"-" + damage);
        }else{
            System.out.println("Удар врага заблокирован!");
            counter--;
        }
    }

    @Override
    public void Recovery() {
        System.out.println("Восстановление! + 10 выносливости");
        stamina += 10;
    }

    @Override
    public void display() {
        System.out.println("Класс: Войн");
        System.out.println("heatlh: " + heatlh + " damage: " + damage + " stamina: " + stamina);
    }
}
