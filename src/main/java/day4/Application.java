package day4;

import day4.student.Student;
import day4.time.OverrideTestClass;
import day4.time.Time;

public class Application {

    static Time time1 = new Time();
    static OverrideTestClass overrideTestClass1 = new OverrideTestClass();

    public static void main(String[] args) {

        testSetHour();
        setAllTime();
        overrideTest();
        createStudent();
    }

    private static void createStudent() {
        Student student1 = new Student("흰수염", 1, 1, 10, 80, 10);
        student1.getStudentInfo();
    }

    //상속받아 오버라이딩 해보기
    private static void overrideTest() {
        overrideTestClass1.setTime(13, 10, 30);
        overrideTestClass1.getTime();
    }

    //시, 분, 초 한번에 바꾸기
    private static void setAllTime() {
        time1.getTime();
        time1.setTime(12, 30, 30);
        time1.getTime();
    }

    //getter, setter test
    public static void testSetHour() {
        System.out.println(time1.getHour());
        time1.setHour(10);
        System.out.println(time1.getHour());
        time1.setHour(30);
        System.out.println(time1.getHour());
    }
}
