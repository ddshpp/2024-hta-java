package day8.list;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        arrayListAdd();
        arrayListSize();
        arrayListSet();
    }

    private static void arrayListSet() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("테스트");
        arrayList.set(0,"테스트2");
        System.out.println(arrayList.get(0));
    }

    private static void arrayListSize() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        System.out.println("arrayList.size() : " + arrayList.size());
    }

    private static void arrayListAdd() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(4);

        int count = 0;

        for (int i : arrayList) {
            System.out.println("arrayList.get(" + count + ") : " + i);
            count++;
        }
    }
}
