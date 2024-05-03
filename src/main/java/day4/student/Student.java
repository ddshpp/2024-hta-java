package day4.student;

public class Student {

    private final String NAME;
    private final int CLASS_NUMBER;
    private final int NUMBER;
    private final int SCORE_KOR;
    private final int SCORE_ENG;
    private final int SCORE_MATH;

    public void getStudentInfo() {
        StudentUtils.getStudentInfo(NAME, CLASS_NUMBER, NUMBER, SCORE_KOR, SCORE_ENG, SCORE_MATH);
    }

    public Student(String NAME, int CLASS_NUMBER, int NUMBER, int SCORE_KOR, int SCORE_ENG,
            int SCORE_MATH) {
        this.NAME = NAME;
        this.CLASS_NUMBER = CLASS_NUMBER;
        this.NUMBER = NUMBER;
        this.SCORE_KOR = SCORE_KOR;
        this.SCORE_ENG = SCORE_ENG;
        this.SCORE_MATH = SCORE_MATH;
    }
}
