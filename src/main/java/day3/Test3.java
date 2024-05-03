package day3;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        Student student1 = new Student("최익현", 1, 1, 70, 60, 80);
        Student student2 = new Student("흰수염", 1, 2, 30, 80, 10);
        Student student3 = new Student("나루토", 1, 3, 10, 10, 20);
        Student student4 = new Student("김두한", 1, 4, 100, 100, 90);

        List<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for (Student student : students) {
            student.studentInfo();
        }
    }
}
