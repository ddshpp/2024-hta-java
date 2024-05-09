package day7.abstraction;

public class PartTimeStaff extends Staff {
    @Override
    void hello() {
        System.out.println("안녕 나는 파트타이머~");
    }

    @Override
    void exitCompany() {
        System.out.println("흑흑 짤렸당 ㅜ");
    }
}
