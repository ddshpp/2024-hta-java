package day7.abstraction;

public class FullTimeStaff extends Staff {

    @Override
    void hello() {
        System.out.println("안녕~~나는 정규직");
    }

    @Override
    void exitCompany() {
        System.out.println("이직합니당~!");
    }
}
