package day5.String;

public class StringTest {

    public static void main(String[] args) {
        createString();
        stringEqualsTest1();
        stringLength();


    }

    private static void stringLength() {
        String string1 = "아이고아이고~~~";
        System.out.println(string1.length());
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
