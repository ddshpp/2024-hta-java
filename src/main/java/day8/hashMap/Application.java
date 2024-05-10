package day8.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        mapPutTest();
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
