package menu.model;

import static menu.constant.BoundValue.MAX_HATE_MENU_COUNT;
import static menu.constant.ErrorMessage.INVALID_HATE_MENU_COUNT;

public class HateMenu {
    private final String[] hateMenu;

    public HateMenu(String[] hateMenu) {
        validate(hateMenu);
        this.hateMenu = hateMenu;
    }

    private void validate(String[] cannotEatMenu) {
        if (cannotEatMenu.length > MAX_HATE_MENU_COUNT.getValue()) {
            throw new IllegalArgumentException(INVALID_HATE_MENU_COUNT.getMessage());
        }
    }

    public String[] getHateMenu() {
        return hateMenu;
    }
}
