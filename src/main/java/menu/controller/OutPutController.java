package menu.controller;

import static menu.constant.BoundValue.MAX_DAY;
import static menu.constant.ErrorMessage.DUPLICATE_CATEGORY;
import static menu.constant.Message.HAS_HATE_MENU;
import static menu.constant.Message.PRINT_CATEGORY;
import static menu.constant.Message.PRINT_MENU_RECOMMEND_RESULT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import menu.model.Category;
import menu.model.Coach;
import menu.model.Menu;
import menu.view.OutPutView;

public class OutPutController {
    public final OutPutView outPutView;

    public OutPutController(OutPutView outPutView) {
        this.outPutView = outPutView;
    }

    public void run(List<Coach> coaches) {
        try {
            List<String> category = getCategoryList();
            validateDuplicateCategory(category);
            PRINT_CATEGORY.printListMessage(category);
            List<String[]> recommendList = getRecommendList(coaches, category);
            printRecommendMenus(coaches, recommendList);
        } catch (IllegalArgumentException e) {
            run(coaches);
        }
    }

    private List<String> getCategoryList() {
        List<String> category = new ArrayList<>();
        for (int i = 0; i < MAX_DAY.getValue(); i++) {
            String categoryByShuffled = Category.pickCategoryByShuffle();
            category.add(categoryByShuffled);
        }
        return category;
    }

    private void validateDuplicateCategory(List<String> category) {
        for (int i = 0; i < category.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (category.get(i).equals(category.get(j))) {
                    throw new IllegalArgumentException(DUPLICATE_CATEGORY.getMessage());
                }
            }
        }
    }

    private List<String[]> getRecommendList(List<Coach> coaches, List<String> category) {
        List<String[]> recommendList = new ArrayList<>();

        for (int i = 0; i < MAX_DAY.getValue(); i++) {
            String categoryName = category.get(i);
            String[] pickedMenus = new String[coaches.size()];
            for (int j = 0; j < coaches.size(); j++) {
                String pickedMenu = Menu.pickMenu(categoryName);
                String[] hateMenus = coaches.get(j).getHateMenu();
                if (Arrays.asList(hateMenus).contains(pickedMenu)) {
                    throw new IllegalArgumentException(HAS_HATE_MENU.getMessage());
                }
                pickedMenus[j] = pickedMenu;
            }
            recommendList.add(pickedMenus);
        }
        return recommendList;
    }

    private void printRecommendMenus(List<Coach> coaches, List<String[]> recommendList) {
        for (int i = 0; i < coaches.size(); i++) {
            String[] temp = new String[MAX_DAY.getValue()];
            for (int j = 0; j < MAX_DAY.getValue(); j++) {
                temp[j] = recommendList.get(j)[i];
            }
            PRINT_MENU_RECOMMEND_RESULT.printCoachAndListMessage(coaches.get(i).getCoachName(), temp);
        }
    }
}
