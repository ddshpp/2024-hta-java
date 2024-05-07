package day5.string;

public class StringTest {

    public static void main(String[] args) {
        createString();
        stringEqualsTest1();
        stringTest1();
    }

    private static void stringTest1() {
        String string1 = "   스트링 클래스의 여러 메소드~~~   테스트~~~";
        System.out.println(string1);
        System.out.println(string1.length());
        System.out.println(string1.trim());
        System.out.println(string1.strip());
        System.out.println(string1.charAt(7));
        String[] split = string1.split(" ");
        System.out.println(split[3]);
    }

    private static void stringEqualsTest1() {
        String string1 = "테스트";
        String string2 = "테스트";
        System.out.println(string1.equals(string2));
        System.out.println(string1==string2);
    }

    private static void createString() {
        String string1 = "스트링 1";
        String string2 = new String("스트링 2");
        char[] chars = {'스', '트', '링', ' ', '3'};
        System.out.println(chars);
    }
}
