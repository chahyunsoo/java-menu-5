package menu.controller;

import static menu.constant.ErrorMessage.INVALID_INPUT;
import static menu.constant.Message.END_MESSAGE;
import static menu.constant.Message.MENU_RECOMMEND_RESULT;
import static menu.constant.Message.START_MESSAGE;

import java.util.List;
import menu.model.Coach;

public class IntegrationController {
    public final InputController inputController;
    public final OutPutController outPutController;

    public IntegrationController(InputController inputController, OutPutController outPutController) {
        this.inputController = inputController;
        this.outPutController = outPutController;
    }

    public void run() {
        try {
            START_MESSAGE.printMessage();
            List<Coach> coaches = inputController.run();
            MENU_RECOMMEND_RESULT.printMessage();
            outPutController.run(coaches);
            END_MESSAGE.printMessage();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(INVALID_INPUT.getMessage());
        }
    }
}
