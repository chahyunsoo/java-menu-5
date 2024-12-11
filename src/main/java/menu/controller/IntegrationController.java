package menu.controller;

import static menu.constant.ErrorMessage.INVALID_INPUT;

public class IntegrationController {
    public final InputController inputController;
    public final OutPutController outPutController;

    public IntegrationController(InputController inputController, OutPutController outPutController) {
        this.inputController = inputController;
        this.outPutController = outPutController;
    }

    public void run() {
        try {

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(INVALID_INPUT.getMessage());
        }
    }
}
