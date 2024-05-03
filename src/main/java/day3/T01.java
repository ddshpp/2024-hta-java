package day3;

public class T01 {
    public static void main(String[] args) {
        System.out.println("T02.testInt : " + T02.testInt);
        System.out.println("T03.testInt : " + T03.testInt);

        T02.testInt = 10;
        System.out.println("T02.testInt : " + T02.testInt);
        System.out.println("T03.testInt : " + T03.testInt);

        T03.testInt = 100;
        System.out.println("T02.testInt : " + T02.testInt);
        System.out.println("T03.testInt : " + T03.testInt);
    }
}
