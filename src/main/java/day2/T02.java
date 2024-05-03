package day2;

public class T02 {

    public static void main(String[] args) {
        Student student1 = new Student("최익현", 1, 16, 230, 110);
        Student student2 = new Student("최익현", 1, 16, 230, 110);
        Student student3 = new Student("최익현", 1, 16, 230, 110);
        Student student4 = new Student("박상춘", 2, 17, 170, 75);
//
//        student1.studentInfo();
//        student1.growth();
//        student1.studentInfo();
//        student1.strongGrowth();
//        student1.studentInfo();

        //객체 주소
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

//        student1.attack(student4);
    }
}
