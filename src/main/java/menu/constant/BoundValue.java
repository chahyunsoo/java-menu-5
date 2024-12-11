package menu.constant;

public enum BoundValue {
    MIN_NAME_LENGTH(2),
    MAX_NAME_LENGTH(4),
    MIN_CANNOT_EAT_MENU_COUNT(0),
    MAX_CANNOT_EAT_MENU_COUNT(2);

    private final int value;

    BoundValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
