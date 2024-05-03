package day1;

public class study1 {

    public static void main(String[] args) {
        printTest();
        createVariable();
        createConstant();
        testBoolean();
        testString();
        testInteger();
        testRealNumber();
        testExponent();
        testTypeConversion();
        testChar();
    }

    private static void testChar() {
        char char1 = 'a';
        char char2 = 'b';
        char char3 = 3;
        char char4 = '4';
        System.out.println("1.  'a' = " + char1);
        System.out.println("2.  'b' = " + char2);
        System.out.println("3.  3 = " + char3);
        System.out.println("4.  '4' = " + char4);
        System.out.println("5.  'a' + 'b' = " + (char1 + char2));
        System.out.println("6.  (char) ('a' + 'b') = " + (char) (char1 + char2));
        System.out.println("7.  'a' + 3  = " + (char1 + char3));
        System.out.println("8.  (char)('a' + 3)  = " + (char) (char1 + char3));
    }

    private static void testTypeConversion() {
        int int1 = 10;
        long long1 = int1;
        long long2 = 10L;
        int int2 = (int) long2;
        System.out.println("int1 : " + int1);
        System.out.println("long1 = int1 : " + long1);
        System.out.println("(long) int1 : " + (long) int1);
        System.out.println("(int) long2 : " + int2);
    }

    private static void testExponent() {
        double double1 = 2.0e2;
        double double2 = 2e3;
        System.out.println(double1);
        System.out.println(double2);
    }

    private static void testRealNumber() {
        int int1 = 1;
        double double1 = 1;
        double double2 = 2;
        double double3 = 3.0;
        double double4 = 4.0;
        double double5 = 5.5;
        System.out.println("1 + 2 : " + (double1 + double2));
        System.out.println("1 + 2 : " + (int1 + double2));
        System.out.println("1 + 3.0 : " + (double1 + double3));
        System.out.println("3.0 + 4.0 : " + (double3 + double4));
        System.out.println("5.5 + 4.0 : " + (double5 + double4));
    }

    private static void testInteger() {
        byte byte1 = 1;
        byte byte2 = Byte.MIN_VALUE;
        byte byte3 = Byte.MAX_VALUE;
        System.out.println("byte1 = 1 : " + byte1);
        System.out.println("byte2 = Byte.MIN_VALUE : " + byte2);
        System.out.println("byte3 = Byte.MAX_VALUE : " + byte3);

        short short1 = 2;
        short short2 = Short.MIN_VALUE;
        short short3 = Short.MAX_VALUE;
        System.out.println("short2 = 2 : " + short1);
        System.out.println("short1 = Short.MIN_VALUE : " + short2);
        System.out.println("short1 = Short.MAX_VALUE : " + short3);

        int int1 = 3;
        int int2 = Integer.MIN_VALUE;
        int int3 = Integer.MAX_VALUE;
        System.out.println("int1 = 3 : " + int1);
        System.out.println("int2 = Integer.MIN_VALUE : " + int2);
        System.out.println("int3 = Integer.MAX_VALUE : " + int3);

        long long1 = 4L;
        long long2 = Long.MIN_VALUE;
        long long3 = Long.MAX_VALUE;
        System.out.println("long1 = 4L : " + long1);
        System.out.println("long2 = Long.MIN_VALUE : " + long2);
        System.out.println("long3 = Long.MAX_VALUE : " + long3);
    }

    private static void testString() {
        char a = 'a';
        char b = 'b';
        String c = "c";
        String d = "d";
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("a + b : " + (a + b));
        System.out.println("c : " + c);
        System.out.println("d : " + d);
        System.out.println("c + d : " + (c + d));
    }

    private static void testBoolean() {
        boolean boolean1 = true;
        boolean boolean2 = false;
        System.out.println(boolean1);
        System.out.println(boolean2);
    }

    private static void createConstant() {
        final int NUMBER1;
        NUMBER1 = 10;
        System.out.println(NUMBER1);
//        NUMBER1 = 20;
//        System.out.println(NUMBER1);
    }

    private static void createVariable() {
        int a = 10;
        int b = 20;

        System.out.println("숫자 바꿔보겠습니다~!");
        System.out.println("a : " + a + ", b : " + b);

        int c;
        c = a;
        a = b;
        b = c;

        System.out.println("a : " + a + ", b : " + b);
        System.out.println("잘 바뀌죠~?");
    }

    private static void printTest() {
        System.out.println("첫번째 출력 : Hello World!");
        System.out.printf("%s%s%s\n", "두번째 출력 : ", 100, 1000);
        System.out.printf("%s\t%s\n%s%s\n", "세번째 출력-1 : ", 100, "세번째 출력-2 : ", 1000);

        int number1 = 1;
        final int NUMBER2 = 2;
        final long NUMBER3 = 3L;
        final long NUMBER4 = 4L;
        long number5 = 5L;

        System.out.println("number1 : " + number1);
        System.out.println("number2 : " + NUMBER2);
        System.out.println("number3 : " + NUMBER3);
        System.out.println("number4 : " + NUMBER4);
        System.out.println("number5 : " + number5);
    }
}
