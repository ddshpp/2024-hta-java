package java0503;

import view.Message;

public class Main {
    public static void main(String[] args) {
//        test01();
        Message.hello();

    }

    private static void test01() {
        Second second1 = new Second();
        second1.test01();
        second1.test02();
    }
}
