package menu.view;

import static menu.constant.Message.INPUT_COACHES_NAME;
import static menu.constant.Message.INPUT_HATE_MENU;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String LINE_SEPARATOR = System.lineSeparator();

    public String readCoachesName() {
        System.out.print(LINE_SEPARATOR);
        INPUT_COACHES_NAME.printMessage();
        return Console.readLine();
    }

    public String readHateMenu(String coachName) {
        System.out.print(LINE_SEPARATOR);
        INPUT_HATE_MENU.printMessage(coachName);
        System.out.print(LINE_SEPARATOR);
        return Console.readLine();
    }
}
