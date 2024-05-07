package day5;

public class Application {

    public static void main(String[] args) {

        ExceptionTest exceptionTest = new ExceptionTest();
//        exceptionTest.test1();
//        exceptionTest.test2();
//        exceptionTest.test3();
//        exceptionTest.test4();
//        exceptionTest5(exceptionTest);
        exceptionTest.test6();
    }

    private static void exceptionTest5(ExceptionTest exceptionTest) {
        try {
            exceptionTest.test5();
        } catch (Exception e) {
            throw new RuntimeException("throws Exception 테스트");
        }
    }
}
