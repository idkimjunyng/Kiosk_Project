package Level_Four;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public String title;
    public int index;
    public String name;
    public String categoryName;

    public List<Menu> menu = new ArrayList<>();

    public Menu(String title) {
        this.title = title;
    }

    public Menu(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public String getTitle() {
        return this.title;
    }
    public int getIndex() {
        return this.index;
    }
    public String getName() {
        return this.name;
    }
    public String getCategoryName() {
        return this.categoryName;
    }


    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setMenuAdd(Menu menu) {
        this.menu.add(menu);
    }
}
