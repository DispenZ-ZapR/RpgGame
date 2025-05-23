package Characters.VilliamEntity;

import java.util.Random;

public class DeadWarrior extends VilliamStatistic{
    @Override
    public int attack() {
        if(!(stamina < 10)) {
            Random r = new Random();
            int attackDamage = damage + r.nextInt(7);
            stamina -= 10;
            return attackDamage;
        }else{
            stamina += 7;
            System.out.println("Мертвый Рыцарь решил восстановится!");
            return 0;
        }
    }

    public DeadWarrior() {
        super(100,70,70,TypeVilliam.DEAD_WARRIOR);
    }

    public DeadWarrior(int heatlh, int damage, int stamina, TypeVilliam deadWarrior, int id) {
        super(100, 70, 70, TypeVilliam.DEAD_WARRIOR);
    }

    @Override
    public void display() {
        System.out.println( "Мертвый рыцарь, "+" health: "+ heatlh+" damage: "+ damage+" stamina: "+ stamina);
    }
}
