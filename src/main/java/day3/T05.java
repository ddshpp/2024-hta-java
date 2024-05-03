package day3;

public class T05 {
    int testInt1 = 100;
    int testInt2;
    static int testInt3 = 333;

    public void test1() {
        System.out.println("test1 호출~!" + this);
        System.out.println(testInt1);
        System.out.println(testInt2);
        System.out.println(testInt3);
    }

    static public void test2() {
        //TODO : static 내에서는 this 사용 불가
//        System.out.println("test2 호출~!"+ this);
        System.out.println("test2 호출~!");
    }
}
