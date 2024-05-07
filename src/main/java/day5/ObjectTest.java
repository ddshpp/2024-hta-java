package day5;

public class ObjectTest {

    public static void main(String[] args) {
        Object object1 = new Object();
        System.out.println(object1);
        System.out.println(object1.toString());
        System.out.println(object1.getClass());
        System.out.println(object1.getClass().getName());
        System.out.println(object1.hashCode());

        int number1 = Integer.parseInt("7ad041f3", 16);
        System.out.println(number1);
    }
}