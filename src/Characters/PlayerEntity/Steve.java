package Characters.PlayerEntity;

import java.util.Random;

public class Steve extends EntityStatistic{
    @Override
    public int attack() {
        if (stamina >= 10) {
        Random r = new Random();
        int dam = damage + r.nextInt(5);
        return dam;
        }else {
            System.out.println("Не достаточно выносливости");
            return 0;
        }
    }
    boolean defense = false;
    @Override
    public void skill() {
        if (stamina > 25) {
            System.out.println("Навык: Поглощение-пошлощает 20% урона");
            stamina -= 25;
        }else {

            System.out.println("Не достаточно выносливости");
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (!defense) {
            heatlh -= (20/ 100) * damage;
        }else {
            heatlh -= damage;
        }
    }

    @Override
    public void display() {
        System.out.println("Steve");
        System.out.println("Health: "+ heatlh + "Damage: "+ damage + "Stamina: "+ stamina);
    }

    public Steve() {
    }

    @Override
    public void Recovery() {
        stamina += 25;
    }

    public Steve(int heatlh, int damage, int stamina, int id) {
        super(100,45,75,PlayerType.STEVE,4);

    }
}
