package Level_Five;

import java.util.Scanner;

public class Kiosk {

    public int menuDepth;

    public void start() {

        Menu menu = new Menu("[ MAIN MENU ]");
        MenuItem menuItem = new MenuItem("[ BURGERS MENU ]");

        menu.setMenuAdd(new Menu(1, "Burgers"));
        menu.setMenuAdd(new Menu(2, "Drinks"));
        menu.setMenuAdd(new Menu(3, "Desserts"));
        menuItem.setMenuItemAdd(new MenuItem(1,"ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 1));
        menuItem.setMenuItemAdd(new MenuItem(2,"SmokeShack", 6.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 1));
        menuItem.setMenuItemAdd(new MenuItem(3,"CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 1));
        menuItem.setMenuItemAdd(new MenuItem(4,"Hamburger", 6.9, "비프패티를 기반으로 야채가 들어간 기본버거", 1));



        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while(isRunning) {

            System.out.println(menu.getTitle());
            for(int i = 0; i < menu.menu.size(); i++) {
                Menu menuList = (Menu) menu.menu.get(i);
                System.out.println(menuList.getIndex() + ". " + menuList.getName());
            }
            System.out.println("0. 종료");
            System.out.println("주문하실 메뉴 번호를 입력해주세요.");
            int menuIndex = scanner.nextInt();

            this.menuDepth = menuIndex;

            if(menuIndex == 0) {
                isRunning = false;
            } else {

                if(menuItem.menuItemList.size() > 1) {

                    Menu menuList = (Menu) menu.menu.get(menuDepth - 1);
                    menu.setCategoryName(menuList.getName());
                    System.out.println(menu.getCategoryName());

                    System.out.println("주문하실 메뉴 아이템 번호를 입력해주세요.");
                    System.out.println(menuItem.getTitle());
                    for(int i = 0; i < menuItem.menuItemList.size(); i++) {
                        MenuItem menuItemList = (MenuItem) menuItem.menuItemList.get(i);
                        if(menuItemList.getMenuIndex() == menuDepth) {
                            System.out.println(menuItemList.getIndex() + ". " + menuItemList.getName() + "                | W " + + menuItemList.getPrice() + " | " + menuItemList.getDescription());
                        }
                    }

                    System.out.println("0. 뒤로가기");
                    int selectedMenu = scanner.nextInt();
                    if(selectedMenu == 0) {
                        continue;
                    } else {
                        MenuItem menuItemList = (MenuItem) menuItem.menuItemList.get(selectedMenu - 1);
                        if(menuItemList.getMenuIndex() == menuDepth) {
                            System.out.println("선택한 메뉴: " + menuItemList.getIndex() + ". " + menuItemList.getName() + "                | W " + + menuItemList.getPrice() + " | " + menuItemList.getDescription());
                        }
                    }


                }
            }
        }

    }

    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        kiosk.start();
    }

}
