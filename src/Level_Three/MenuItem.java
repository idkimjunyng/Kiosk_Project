package Level_Three;

public class MenuItem {

    public int index;
    public String name;
    public double price;
    public String description;

    public MenuItem(int index, String name, double price, String description) {
        this.index = index;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getIndex() {
        return this.index;
    }
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public String getDescription() {
        return this.description;
    }


}
