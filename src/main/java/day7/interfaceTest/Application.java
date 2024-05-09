package day7.interfaceTest;

public class Application {
    public static void main(String[] args) {
//        createObjectImplementsInterface();
//        interfaceConstantsTest();
//        implementsTest();

        defaultAndStaticMehodTest();
    }

    private static void defaultAndStaticMehodTest() {
        StrongMan strongMan = new StrongMan();
        strongMan.hello3();
        InterfaceTest2.hello4();
    }

    private static void implementsTest() {
        StrongMan strongMan = new StrongMan();
        strongMan.hello2();
    }

    private static void interfaceConstantsTest() {
        System.out.println(InterfaceTest.name);
    }

    private static void createObjectImplementsInterface() {
        StrongMan strongMan = new StrongMan();
        strongMan.hello();
    }
}
