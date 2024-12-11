package menu.model;

import static menu.constant.ErrorMessage.INVALID_HATE_MENU_COUNT;

import menu.constant.BoundValue;

public class CannotEatMenu {
    private final String[] cannotEatMenu;

    public CannotEatMenu(String[] cannotEatMenu) {
        validate(cannotEatMenu);
        this.cannotEatMenu = cannotEatMenu;
    }

    private void validate(String[] cannotEatMenu) {
        if (cannotEatMenu.length > BoundValue.MAX_CANNOT_EAT_MENU_COUNT.getValue()) {
            throw new IllegalArgumentException(INVALID_HATE_MENU_COUNT.getMessage());
        }
    }

    public String[] getCannotEatMenu() {
        return cannotEatMenu;
    }
}
