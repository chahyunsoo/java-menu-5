package menu.constant;

public enum InputMessage {
    ;

    private final String message;

    InputMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.print(this.message);
    }
}
