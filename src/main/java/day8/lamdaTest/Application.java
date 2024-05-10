package day8.lamdaTest;

import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {
        printFor1();
        printLamda1();
        printLamda2();
        printLamda3();
    }

    private static void printLamda3() {
        IntStream.range(0,10).forEach(System.out::println);
    }

    private static void printLamda2() {
        IntStream.range(0,10).forEach(i -> System.out.println(i));
    }

    private static void printLamda1() {
        IntStream.range(0, 10).forEach((int value) -> System.out.println(value));
    }

    private static void printFor1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
