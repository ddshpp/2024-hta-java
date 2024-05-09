package day7.interfaceTest;

public class StrongMan implements InterfaceTest, InterfaceTest2 {
    @Override
    public void hello() {
        System.out.println("안녕~~~~~~~나는 스트롱맨이야~~~!");
    }

    @Override
    public void hello2() {
        System.out.println(InterfaceTest2.helloMessage);
    }
}
