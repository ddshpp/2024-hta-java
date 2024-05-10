package day8.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        mapPutTest();
        mapRemoveTest();
    }

    private static void mapRemoveTest() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "테스트1");
        map.put(2, "테스트2");
        map.put(3, "테스트3");

        System.out.println(map);
        map.remove(2);
        System.out.println(map);
    }

    private static void mapPutTest() {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            String value = i + "입니다";
            map.put(i, value);
        }
        map.put(10, "10입니다");
        map.put(10, "10입니다2");

        System.out.println(map);
    }
}
