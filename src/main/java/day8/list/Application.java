package day8.list;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
//        arrayListAdd();
//        arrayListSize();
//        arrayListSet();
//        otherTypeAddTest();

        listTypeTest();
    }

    private static void listTypeTest() {
        List<StrongMan> strongManList = new ArrayList<>();
        strongManList.add(new StrongMan("강호동", 16, 3000));
        strongManList.add(new StrongMan("김동현", 16, 2700));
        strongManList.add(new StrongMan("현", 16, 100));

        for (StrongMan strongMan : strongManList) {
            strongMan.getInfo();
        }
    }

    private static void otherTypeAddTest() {
        ArrayList list = new ArrayList<>();
        list.add("A");
        list.add(1);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }

    private static void arrayListSet() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("테스트");
        arrayList.set(0, "테스트2");
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
