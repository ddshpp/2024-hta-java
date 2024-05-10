package day8.HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
//        setAddTest();
//        printSetTest();

        setSortTest();
    }

    private static void setSortTest() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            set.add(random.nextInt(100));
        }
        System.out.println(set);

        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    private static void printSetTest() {
        Set<Integer> set = new HashSet<>();
        set.add(100);
        set.add(200);
        set.add(300);

        System.out.println(set);
    }

    private static void setAddTest() {
        Set<Integer> set = new HashSet<>();

        System.out.println("set.add(1) : " + set.add(1));
        System.out.println("set.size() : " + set.size());
        System.out.println("set.add(1) : " + set.add(1));
        System.out.println("set.size() : " + set.size());
        System.out.println("set.add(2) : " + set.add(2));
        System.out.println("set.size() : " + set.size());
        System.out.println("set.add(3) : " + set.add(3));
        System.out.println("set.size() : " + set.size());
        System.out.println("set.add(3) : " + set.add(3));
        System.out.println("set.size() : " + set.size());
        System.out.println("set.add(5) : " + set.add(5));
        System.out.println("set.size() : " + set.size());
    }
}
