package Characters.VilliamEntity.PlayerEntity;

import java.util.Random;

public class Wizard extends EntityStatistic{
    public Wizard(int heatlh, int damage, int stamina, int id) {
        super(40, 27, 60, PlayerType.WIZARD, 3);

    }

    @Override
    public void Recovery() {
        System.out.println("Восстановление! +12");
        stamina += 12;
    }

    @Override
    public void skill() {
        System.out.println("Вы использовали навык! Усилитель-добавляет +5 здоровья, и прибалвяет +5 силы, тратит -20 выносливости");
        stamina -= 20;
        damage += 5;
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
            System.out.println("Вы нанесли удар: -" + dam);
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
