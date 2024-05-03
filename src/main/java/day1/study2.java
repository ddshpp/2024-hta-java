package day1;

public class study2 {

    public static void main(String[] args) {
        testDivision();
        testOverflow();
        testBoolean();
    }

    private static void testBoolean() {
        boolean boolean1 = true;
        boolean boolean2 = false;

        System.out.println("boolean1 : " + boolean1);
        System.out.println("!(boolean1) : " + !boolean1);
        System.out.println("boolean2 : " + boolean2);
        System.out.println("!(boolean2) : " + !boolean2);
    }

    private static void testOverflow() {
        int a = 1000000;
        int b = 2000000;
        long c = 2000000;

        int result1 = a * b;
        long result2 = (long) a * b;
        long result3 = a * b;
        long result4 = a * c;
        System.out.println("int a = 1000000");
        System.out.println("int b = 2000000");
        System.out.println("long c = 2000000");

        System.out.println("int result1 = a * b : " + result1);
        System.out.println("long result2 = (long) a * b :" + result2);
        System.out.println("long result3 = a * b : " + result3);
        System.out.println("long result4 = a * c : " + result4);
    }

    private static void testDivision() {
        System.out.println("하이하이!!");

        int number1 = 30;
        int number2 = 7;

        System.out.println("30 / 7 = " + number1 / number2);
        System.out.println("30 % 7 = " + number1 % number2);
        System.out.println("30 / 7. = " + number1 / 7.0);
        System.out.println("30 % 7. = " + number1 % 7.0);

        short s1 = 10;
        short s2 = 10;
        int i1 = s1 + s2;
        short s3 = (short) (s1 + s2);

        System.out.println(i1);
        System.out.println((short) i1);
        System.out.println(s3);
    }
}
