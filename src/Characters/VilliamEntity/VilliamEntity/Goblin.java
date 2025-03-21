package Characters.VilliamEntity.VilliamEntity;

import java.util.Random;

public class Goblin extends VilliamStatistic{
    public Goblin(int heatlh, int damage, int stamina, TypeVilliam type, int id) {
        super(40, 15, 60, TypeVilliam.GOBLIN, 1);
    }


    @Override
    public int attack() {
        if(!(stamina < 5)) {
            Random r = new Random();
            int attackDamage = damage + r.nextInt(7);
            stamina -= 5;
            return attackDamage;
        }else{
            stamina += 7;
            System.out.println("Гоблин решил восстановится!");
            return 0;
        }
    }

    @Override
    public String display() {
        return "Гоблин, "+" health: "+ heatlh+" damage: "+ damage+" stamina: "+ stamina;
    }
}
