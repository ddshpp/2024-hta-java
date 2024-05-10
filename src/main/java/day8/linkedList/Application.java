package day8.linkedList;

import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        linkedListAdd();
    }

    private static void linkedListAdd() {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
