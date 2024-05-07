package day5;

import day5.Exception.ExceptionTest;

public class Application {

    public static void main(String[] args) {

        ExceptionTest exceptionTest = new ExceptionTest();
//        exceptionTest.test1();
//        exceptionTest.test2();
//        exceptionTest.test3();
//        exceptionTest.test4();
//        exceptionTest5(exceptionTest);
//        exceptionTest.test6();

        stringTypeValueToString();
        toStringOverride();
    }

    public static void toStringOverride() {
        InstanceTest instanceTest1 = new InstanceTest("테스트1", 16, 100);
        String result = instanceTest1.toString();
        System.out.println(result);
    }

    private static void stringTypeValueToString() {
        String string1 = new String("toString 테스트중");
        System.out.println(string1);
        System.out.println(string1.hashCode());
    }

    public static void exceptionTest5(ExceptionTest exceptionTest) {
        try {
            exceptionTest.test5();
        } catch (Exception e) {
            throw new RuntimeException("throws Exception 테스트");
        }
    }
}
