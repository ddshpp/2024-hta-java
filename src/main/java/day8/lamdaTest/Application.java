package day8.lamdaTest;

import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {
//        printFor1();
//        printLambda1();
//        printLambda2();
//        printLambda3();

        lambdaMethodTest1();
        lambdaMethodTest2();
        lambdaMethodTest3();
    }

    private static void lambdaMethodTest3() {
        LambdaTest lambdaTest = (x, y) -> x * y;
        System.out.println("lambdaMethodTest3 : " + lambdaTest.method1(30, 30));
    }

    private static void lambdaMethodTest2() {
        LambdaTest lambdaTest = new LambdaTest() {
            @Override
            public int method1(int a, int b) {
                return a + b;
            }
        };

        System.out.println("lambdaMethodTest2 : " + lambdaTest.method1(10, 20));
    }

    private static void lambdaMethodTest1() {
        LambdaClass lambdaClass = new LambdaClass();
        System.out.println("lambdaMethodTest1 : " + lambdaClass.method1(3, 10));
    }

    private static void printLambda3() {
        IntStream.range(0, 10).forEach(System.out::println);
    }

    private static void printLambda2() {
        IntStream.range(0, 10).forEach(i -> System.out.println(i));
    }

    private static void printLambda1() {
        IntStream.range(0, 10).forEach((int value) -> System.out.println(value));
    }

    private static void printFor1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
