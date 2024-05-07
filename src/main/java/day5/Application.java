package day5;

import day5.exception.ExceptionTest;

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
        stringEqualsTest();
        instanceEqualsTest();
    }

    private static void instanceEqualsTest() {
        InstanceTest instanceTest1 = new InstanceTest("테스트", 1, 1);
        InstanceTest instanceTest2 = new InstanceTest("테스트", 1, 1);
        System.out.println(instanceTest1 == instanceTest2);
        System.out.println(instanceTest1.equals(instanceTest2));
    }

    private static void stringEqualsTest() {
        int number1 = 10;
        int number2 = 10;
        int number3 = 20;
        String string1 = "String";
        String string2 = "String";

        System.out.println(number1 == number2);
        System.out.println(number1 == number3);
        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));
    }

    public static void toStringOverride() {
        InstanceTest instanceTest1 = new InstanceTest("테스트1", 16, 100);
        String result = instanceTest1.toString();
        System.out.println(result);
    }

    private static void stringTypeValueToString() {
        String string1 = "toString 테스트중";
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
