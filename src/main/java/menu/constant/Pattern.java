package menu.constant;

public enum Pattern {
    ERROR_PREFIX("[ERROR] "),
    COMMA(",");

    private final String value;

    Pattern(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
