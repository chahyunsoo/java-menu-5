package menu.model;

import static menu.constant.ErrorMessage.INVALID_COACH_NAME_LENGTH;

import menu.constant.BoundValue;

public class Coach {
    private final String coachName;
    private final CannotEatMenu cannotEatMenu;

    public Coach(String coachName, CannotEatMenu cannotEatMenu) {
        validate(coachName);
        this.coachName = coachName;
        this.cannotEatMenu = cannotEatMenu;

    }

    private void validate(String coachName) {
        validateCoachNameLength(coachName);
    }

    private void validateCoachNameLength(String coachName) {
        if (coachName.length() < BoundValue.MIN_NAME_LENGTH.getValue() ||
                    coachName.length() > BoundValue.MAX_NAME_LENGTH.getValue()) {
            throw new IllegalArgumentException(INVALID_COACH_NAME_LENGTH.getMessage());
        }
    }

    public String getCoachName() {
        return this.coachName;
    }

    public CannotEatMenu getCannotEatMenu() {
        return cannotEatMenu;
    }
}
