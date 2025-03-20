package Characters.VilliamEntity.VilliamEntity;

public class Barbarian extends VilliamStatistic{
    public Barbarian(int heatlh, int damage, int stamina, int id) {
        super(80, 80, 60, TypeVilliam.BARBARIAN, 1);
    }
    void display() {
        System.out.println("heatlh: " + heatlh + " damage: " + damage + " stamina: " + stamina);
    }
}
