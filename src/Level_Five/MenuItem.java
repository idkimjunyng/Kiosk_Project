package Level_Five;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {

    private String title;
    private int index;
    private String name;
    private double price;
    private String description;
    private int menuIndex;

    public List<MenuItem> menuItemList = new ArrayList<>();

    public MenuItem(String title) {
        this.title = title;
    }

    public MenuItem(int index, String name, double price, String description, int menuIndex) {
        this.index = index;
        this.name = name;
        this.price = price;
        this.description = description;
        this.menuIndex = menuIndex;
    }

    public String getTitle() {
        return this.title;
    }
    public int getIndex() {
        return this.index;
    }
    public double getPrice() {
        return this.price;
    }
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public int getMenuIndex() {
        return this.menuIndex;
    }


    public void setMenuItemAdd(MenuItem menuItem) {
        this.menuItemList.add(menuItem);
    }

}
