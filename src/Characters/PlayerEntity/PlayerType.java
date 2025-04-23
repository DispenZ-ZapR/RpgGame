package Characters.PlayerEntity;

public enum PlayerType {
    WARRIOR("1)Рыцарь"),
    ALEKSANDR("2)Александр"),
    WIZARD("3)Маг"),
    STEVE("4)Стив из Майнкрафта");
    String description;

    PlayerType(String description) {
        this.description = description;
    }
    public static void getDescription() {
        for (PlayerType type : PlayerType.values()) {
            System.out.println(type.description);
        }
    }
}

