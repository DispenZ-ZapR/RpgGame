package Characters.PlayerEntity;

public enum PlayerType {
    WARRIOR("Рыцарь"),
    ALEKSANDR("Александр"),
    WIZARD("Маг"),
    STEVE("Стив из Майнкрафта");
    String description;

    PlayerType(String description) {
        this.description = description;
    }
}
