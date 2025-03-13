package Level_Two;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    

    public int getIndex() { return this.index; }
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public String getDescription() {
        return this.description;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while(isRunning) {

            System.out.println("[ SHAKE SHAKE MENU ]");
            List<MenuItem> menuItemList = new ArrayList<MenuItem>();
            menuItemList.add(new MenuItem(1,"ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
            menuItemList.add(new MenuItem(2,"SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
            menuItemList.add(new MenuItem(3,"CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
            menuItemList.add(new MenuItem(4,"Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
            for(int i = 0; i < menuItemList.size(); i++) {

                MenuItem menuList = (MenuItem) menuItemList.get(i);

                System.out.println(menuList.getIndex() + ". " + menuList.getName() + "                | W " + menuList.getPrice() + " | " + menuList.getDescription());
            }
            System.out.println("0. 종료");

            int shakeShakeIndexNumber = scanner.nextInt();
            if(shakeShakeIndexNumber == 1) {
                MenuItem menuList = (MenuItem) menuItemList.get(0);
                System.out.println(menuList.getIndex() + ". " + menuList.getName() + "                | W " + menuList.getPrice() + " | " + menuList.getDescription());
            } else if(shakeShakeIndexNumber == 2) {
                MenuItem menuList = (MenuItem) menuItemList.get(1);
                System.out.println(menuList.getIndex() + ". " + menuList.getName() + "                | W " + menuList.getPrice() + " | " + menuList.getDescription());
            } else if(shakeShakeIndexNumber == 3) {
                MenuItem menuList = (MenuItem) menuItemList.get(2);
                System.out.println(menuList.getIndex() + ". " + menuList.getName() + "                | W " + menuList.getPrice() + " | " + menuList.getDescription());
            } else if(shakeShakeIndexNumber == 4) {
                MenuItem menuList = (MenuItem) menuItemList.get(3);
                System.out.println(menuList.getIndex() + ". " + menuList.getName() + "                | W " + menuList.getPrice() + " | " + menuList.getDescription());
            } else if(shakeShakeIndexNumber == 0) {
                System.out.println("키오스크가 종료되었습니다.");
                isRunning = false;
            } else {
                System.out.println("메뉴를 확인해주세요.");
            }

        }


    }
}
