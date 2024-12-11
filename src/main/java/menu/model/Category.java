package menu.model;

public enum Category {
    JAPAN("일식",1),
    KOREAN("한식",2),
    CHINA("중식",3),
    ASIA("아시안",4),
    WEST("양식",5);

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
}
