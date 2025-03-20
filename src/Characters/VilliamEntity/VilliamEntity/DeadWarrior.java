package Characters.VilliamEntity.VilliamEntity;

public class DeadWarrior extends VilliamStatistic{
    public DeadWarrior(int heatlh, int damage, int stamina, int id) {
        super(60, 70, 70, TypeVilliam.DEAD_WARRIOR, 1);
    }
    void display() {
        System.out.println("heatlh: " + heatlh + " damage: " + damage + " stamina: " + stamina);
    }
}
