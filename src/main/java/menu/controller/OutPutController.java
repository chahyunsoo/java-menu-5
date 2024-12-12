package menu.controller;

import java.util.List;
import menu.model.Category;
import menu.model.Coach;
import menu.model.Menu;
import menu.view.OutPutView;

public class OutPutController {
    public final OutPutView outPutView;
    private static final String LINE_SEPARATOR = System.lineSeparator();


    public OutPutController(OutPutView outPutView) {
        this.outPutView = outPutView;
    }

    public void run(List<Coach> coaches) {
        Category shuffledCategory = Category.pickCategoryByShuffle();
        System.out.println("shuffledCategory.getCategoryName() = " + shuffledCategory.getCategoryName());
        String pickedMenu = Menu.pickMenu(shuffledCategory.getCategoryName());
        System.out.println("pickedMenu = " + pickedMenu);
    }


}
