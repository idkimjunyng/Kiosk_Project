package Level_One;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while(isRunning) {
            System.out.println("[ SHAKE SHAKE MENU ]");
            System.out.println("1. ShackBurger      | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack       | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. CheeseBurger     | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger        | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료");

            int shakeShakeIndexNumber = scanner.nextInt();
            if(shakeShakeIndexNumber == 1) {
                System.out.println("1번 메뉴를 선택하셨습니다.");
                System.out.println("1. ShackBurger      | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");

            } else if(shakeShakeIndexNumber == 2) {
                System.out.println("2번 메뉴를 선택하셨습니다.");
                System.out.println("2. SmokeShack       | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");

            } else if(shakeShakeIndexNumber == 3) {
                System.out.println("3번 메뉴를 선택하셨습니다.");
                System.out.println("3. CheeseBurger     | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");

            } else if(shakeShakeIndexNumber == 4) {
                System.out.println("4번 메뉴를 선택하셨습니다.");
                System.out.println("4. Hamburger        | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");

            } else if(shakeShakeIndexNumber == 0) {
                System.out.println("키오스크가 종료되었습니다.");
                isRunning = false;
            } else {
                System.out.println("메뉴를 확인해주세요.");
            }
        }

    }

}
