package day5;

public class WrapperTest {
    public static void main(String[] args) {

        Integer maxValue = Integer.MAX_VALUE;
        Integer minValue = Integer.MIN_VALUE;
        Integer int1 = Integer.parseInt("1");
        Integer int2 = Integer.valueOf("2");

        System.out.println(maxValue);
        System.out.println(minValue);
        System.out.println(int1);
        System.out.println(int2);

        int a = 10;
        String b = String.valueOf(a);
        System.out.println(b);
    }
}
