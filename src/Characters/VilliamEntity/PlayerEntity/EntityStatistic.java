package Characters.VilliamEntity.PlayerEntity;

public abstract class EntityStatistic {
    protected int heatlh;
    protected int id;
    public EntityStatistic(int heatlh, int damage, int stamina, PlayerType type, int id) {
        this.heatlh = heatlh;
        this.damage = damage;
        this.stamina = stamina;
        this.type = type;
        this.id = id;
    }

    protected int damage;

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getHeatlh() {
        return heatlh;
    }

    public void setHeatlh(int heatlh) {
        this.heatlh = heatlh;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public PlayerType getType() {
        return type;
    }

    public void setType(PlayerType type) {
        this.type = type;
    }
    abstract int attack();
    abstract void skill();

    boolean isAlive(int health){
        if(health > 0){
            return true;
        }else {
            return false;
        }
    }

    protected int stamina;
    protected PlayerType type;
}
