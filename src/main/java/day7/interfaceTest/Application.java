package day7.interfaceTest;

public class Application {
    public static void main(String[] args) {
        createObjectImplementsInterface();
        interfaceConstantsTest();
        implementsTest();
    }

    private static void implementsTest() {
        StrongMan strongMan = new StrongMan();
        strongMan.hello2();
    }

    private static void interfaceConstantsTest() {
        System.out.println(interfaceTest.name);
    }

    private static void createObjectImplementsInterface() {
        StrongMan strongMan = new StrongMan();
        strongMan.hello();
    }
}
