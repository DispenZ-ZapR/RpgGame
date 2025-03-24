package Characters.PlayerEntity;

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

    public abstract int attack();
    public abstract void skill();

    public boolean isAlive(){
        if(heatlh > 0){
            return true;
        }else {
            System.out.println("Вы пройграли!");
            return false;
        }
    }

    public abstract void takeDamage(int damage);
    public abstract void display();
    public abstract void Recovery();
    protected int stamina;
    protected PlayerType type;
}
