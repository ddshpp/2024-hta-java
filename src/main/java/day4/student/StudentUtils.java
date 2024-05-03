package day4.student;

public class StudentUtils {

    public static void getStudentInfo(String name, int classNumber, int number, int scoreKor,
            int scoreEng, int scoreMath) {
        System.out.println("이름 : " + name);
        System.out.println("반 : " + classNumber);
        System.out.println("번호 : " + number);
        System.out.println("국어점수 : " + scoreKor);
        System.out.println("영어점수 : " + scoreEng);
        System.out.println("수학점수 : " + scoreMath);
    }
}
