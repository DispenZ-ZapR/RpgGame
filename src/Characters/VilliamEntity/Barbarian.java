package Characters.VilliamEntity;

import java.util.Random;

public class Barbarian extends VilliamStatistic {
    public Barbarian(int heatlh, int damage, int stamina, int id) {
        super(100, 75, 60, TypeVilliam.BARBARIAN);
    }

    public Barbarian() {
        super(100, 75, 60, TypeVilliam.BARBARIAN);
    }

    @Override
    public int attack() {
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

    @Override
    public void display() {

        System.out.println("Варвар "+" health: "+ heatlh+" damage: "+ damage+" stamina: "+ stamina);
    }
}

