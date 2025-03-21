package Characters.VilliamEntity.VilliamEntity;

public abstract class VilliamStatistic {
    protected int heatlh;
    protected int damage;
    protected int stamina;
    protected TypeVilliam type;
    protected int Id;
    public abstract int attack();

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

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public TypeVilliam getType() {
        return type;
    }

    public void setType(TypeVilliam type) {
        this.type = type;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
    public boolean isAlive() {
        if(heatlh>0){
            return true;
        }else {
            return false;
        }
    }
    public abstract String display();

    public void takeDamage(int damage) {
        heatlh -= damage;
    }
    public VilliamStatistic(int heatlh, int damage, int stamina, TypeVilliam type, int Id) {
        this.heatlh = heatlh;
        this.damage = damage;
        this.stamina = stamina;
        this.type = type;
        this.Id = Id;
    }
}
