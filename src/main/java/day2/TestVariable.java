package day2;

public class TestVariable {

    static String str1;
    static int int1;
    static Long long1;
    static boolean boolean1;
    static char char1;
    int testNumber = 10;
    static String str2 = "눼헤헤";

    public static void getVariable() {
        System.out.println(str1);
        System.out.println(int1);
        System.out.println(long1);
        System.out.println(boolean1);
        System.out.println(char1);
    }

    public void getVariable2() {
        int a = 1;
        System.out.println(a);
    }

    public void testNumber() {
        int testNumber = 1;
        System.out.println(testNumber);
        System.out.println(this.testNumber);
    }
}
