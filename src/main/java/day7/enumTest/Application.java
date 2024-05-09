package day7.enumTest;

import day7.enumTest.enums.StrongMan;

public class Application {
    public static void main(String[] args) {
        System.out.println(StrongMan.DONG_HYUN_KIM);

        String message = StrongMan.DONG_HYUN_KIM.getMessage();
        System.out.println(message);
    }
}
