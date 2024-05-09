package day7.interfaceTest;

public interface InterfaceTest2 {
    String helloMessage = "이얏호!!!!!!!!!!";

    void hello2();

    default void hello3() {
        System.out.println("default method test 입니다");
    }

    static void hello4() {
        System.out.println("static method test 입니다.");
    }
}
