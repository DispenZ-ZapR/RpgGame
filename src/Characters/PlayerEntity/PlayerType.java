package Characters.PlayerEntity;

public enum PlayerType {
    WARRIOR("Рыцарь"),
    ALEKSANDR("Александр"),
    WIZARD("Маг");
    String description;

    PlayerType(String description) {
        this.description = description;
    }
}
