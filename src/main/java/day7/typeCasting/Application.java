package day7.typeCasting;

public class Application {
    public static void main(String[] args) {
        createObject();
        createInheritedObject();
        upCasting();
//        downCasting();
        downCasting2();
    }

    private static void downCasting2() {
        Type2 test5 = new Type2("자식입니다", 100, 200, 300);
        test5.testType1();
        test5.testType2();
        String getToString1 = test5.toString();
        System.out.println("getToString1 : " + getToString1);
        System.out.println();

        Type1 test6;
        test6 = test5;
        test6.testType1();
        String getToString2 = test6.toString();
        System.out.println("getToString2 : " + getToString2);
        System.out.println();

        Type2 test7;
        test7 = (Type2) test5;
        test7.testType1();
        test7.testType2();
        String getToString3 = test7.toString();
        System.out.println("getToString3 : " + getToString3);
    }

    private static void downCasting() {
        Type2 test4 = (Type2) new Type1("4번", 1);
        String getToString = test4.toString();
        System.out.println(getToString);
    }

    private static void upCasting() {
        Type1 test3 = new Type2("3번", 1, 2, 3);
        String getToString = test3.toString();
        System.out.println(getToString);
    }

    private static void createInheritedObject() {
        Type2 test2 = new Type2("2번", 1, 2, 3);
        String getToString = test2.toString();
        System.out.println(getToString);
    }

    private static void createObject() {
        Type1 test1 = new Type1("1번", 1);
        String getToString = test1.toString();
        System.out.println(getToString);
    }
}
