package menu.controller;

import static menu.constant.Pattern.COMMA;

import java.util.ArrayList;
import java.util.List;
import menu.model.Coach;
import menu.model.HateMenu;
import menu.view.InputView;
import menu.view.OutPutView;

public class InputController {
    private final InputView inputView;

    public InputController(InputView inputView) {
        this.inputView = inputView;
    }

    public List<Coach> run() {
        try {
            return getCoaches();
        } catch (IllegalArgumentException e) {
            OutPutView.printErrorMessage(e.getMessage());
            return run();
        }
    }

    private List<Coach> getCoaches() {
        String[] coachesName = inputView.readCoachesName().split(COMMA.getValue());
        List<Coach> coaches = new ArrayList<>();

        for (int i = 0; i < coachesName.length; i++) {
            String[] hateMenu = getHateMenu(coachesName[i]);
            Coach coach = new Coach(coachesName[i], new HateMenu(hateMenu));
            coaches.add(coach);
        }
        return coaches;
    }

    private String[] getHateMenu(String coachName) {
        return inputView.readHateMenu(coachName).split(COMMA.getValue());
    }

}
