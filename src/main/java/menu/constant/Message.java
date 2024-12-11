package menu.constant;

public enum Message {
    START_MESSAGE("점심 메뉴 추천을 시작합니다."),
    INPUT_COACHES_NAME("코치의 이름을 입력해 주세요. (, 로 구분)"),
    INPUT_HATE_MENU("%s(이)가 못 먹는 메뉴를 입력해 주세요."),
    MENU_RECOMMEND_RESULT("메뉴 추천 결과입니다."
                                  + System.lineSeparator()
                                  + "[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]"
                                  + System.lineSeparator()
                                  + "[ 카테고리 | 한식 | 한식 | 일식 | 중식 | 아시안 ]"),
    END_MESSAGE("추천을 완료했습니다."),
    PRINT_MENU_RECOMMEND_RESULT("[ "
                                        + "%s"
                                        + " | "
                                        + "%s"
                                        + " | "
                                        + "%s"
                                        + " | "
                                        + "%s"
                                        + " | "
                                        + "%s"
                                        + " | "
                                        + "%s"
                                        + " ]");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(this.message);
    }

    public void printMessage(Object... args) {
        System.out.printf(this.message, args);
    }
}
