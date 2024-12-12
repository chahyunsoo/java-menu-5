package menu.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public enum Menu {
    KOREA_MENU("한식", List.of("김밥", "김치찌개", "쌈밥", "된장찌개", "비빔밥", "칼국수", "불고기", "떡볶이", "제육볶음")),
    WEST_MENU("양식", List.of("라자냐", "그라탱", "뇨끼", "끼슈", "프렌치 토스트", "바게트", "스파게티", "피자", "파니니")),
    JAPAN_MENU("일식", List.of("규동", "우동", "미소시루", "스시", "가츠동", "오니기리", "하이라이스", "라멘", "오코노미야끼")),
    CHINA_MENU("중식", List.of("깐풍기", "볶음면", "동파육", "짜장면", "짬뽕", "마파두부", "탕수육", "토마토 달걀볶음", "고추잡채")),
    ASIA_MENU("아시안", List.of("팟타이", "카오 팟", "나시고렝", "파인애플 볶음밥", "쌀국수", "똠얌꿍", "반미", "월남쌈", "분짜"));


    private final String categoryName;
    private final List<String> menus;

    Menu(String categoryName, List<String> menus) {
        this.categoryName = categoryName;
        this.menus = menus;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<String> getMenus() {
        return menus;
    }

    public static Menu findByCategoryName(String categoryName) {
        Menu returnMenu = null;
        for (Menu menu : Menu.values()) {
            if (menu.categoryName.equals(categoryName)) {
                returnMenu = menu;
            }
        }
        return returnMenu;
    }

    public static String pickMenu(String categoryName) {
        Menu menu = findByCategoryName(categoryName);
        return Randoms.shuffle(menu.getMenus()).get(0);
    }

}
