package menu.application;

import menu.controller.InputController;
import menu.controller.IntegrationController;
import menu.controller.OutPutController;
import menu.view.InputView;
import menu.view.OutPutView;

public class MenuApplication {
    public void runMenuApplication() {
        InputView inputView = new InputView();
        OutPutView outPutView = new OutPutView();
        InputController inputController = new InputController(inputView);
        OutPutController outPutController = new OutPutController(outPutView);
        IntegrationController integrationController = new IntegrationController(inputController, outPutController);
        integrationController.run();
    }
}
