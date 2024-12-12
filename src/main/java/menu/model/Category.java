package menu.model;

import camp.nextstep.edu.missionutils.Randoms;

public enum Category {
    KOREAN("한식", 2),
    WEST("양식", 5),
    JAPAN("일식", 1),
    CHINA("중식", 3),
    ASIA("아시안", 4);

    private final String categoryName;
    private final int categoryNumber;

    Category(String categoryName, int categoryNumber) {
        this.categoryName = categoryName;
        this.categoryNumber = categoryNumber;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getCategoryNumber() {
        return categoryNumber;
    }


    public static String pickCategoryByShuffle() {
        int pickNumberInRange = Randoms.pickNumberInRange(1, 5);
        return getCategoryNameByCategoryNumber(pickNumberInRange);
    }

    public static String getCategoryNameByCategoryNumber(int pickNumberInRange) {
        String categoryName = null;
        for (Category category : Category.values()) {
            if (category.getCategoryNumber() == pickNumberInRange) {
                categoryName = category.getCategoryName();
            }
        }
        return categoryName;
    }
}
