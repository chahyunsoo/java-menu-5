package menu.constant;

public enum ErrorMessage {
    INVALID_COACH_NAME_LENGTH("코치의 이름은 최소 2글자에서 최대 4글자여야 합니다."),
    INVALID_COACHES_COUNT("코치는 최소 2명 이상 입력해야 합니다."),
    INVALID_HATE_MENU_COUNT("코치당 싫어하는 메뉴는 최대 2개를 넘어서는 안됩니다."),
    INVALID_INPUT("유효하지 않은 입력 값입니다. 다시 입력해 주세요.");


    private final String message;

    ErrorMessage(String message) {
        this.message = "[ERROR] " + message;
    }

    public String getMessage() {
        return this.message;
    }

}
