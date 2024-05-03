package day4.time;

public class OverrideTestClass extends Time {

    @Override
    public void getTime() {
        super.getTime();
        System.out.println("Override Test 성공!");
    }
}
