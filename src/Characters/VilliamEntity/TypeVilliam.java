package Characters.VilliamEntity;

public enum TypeVilliam {
    BARBARIAN("Варвар"),
    GOBLIN("Гоблин"),
    DEAD_WARRIOR("Нечисть рыцарь");
    String description;

    TypeVilliam(String description) {
        this.description = description;
    }
}
