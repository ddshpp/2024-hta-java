package java0502;

public class Student {
    private final String lineSeparator = System.lineSeparator();
    private final String name;
    private final int ban;
    private final int no;
    private final int kor;
    private final int eng;
    private final int math;
    private final int totalScore;
    private final double averageScore;


    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.totalScore = getTotalScore();
        this.averageScore = getAverageScore();
    }

    public void studentInfo() {
        System.out.println("이름 : " + name + lineSeparator
                + "반 : " + ban + lineSeparator
                + "번호 : " + no + lineSeparator
                + "국어점수 : " + kor + lineSeparator
                + "영어점수 : " + eng + lineSeparator
                + "수학점수 : " + math + lineSeparator
                + "총점수 : " + totalScore + lineSeparator
                + "평균점수 : " + averageScore + lineSeparator);
    }

    private int getTotalScore() {
        return kor + eng + math;
    }

    private double getAverageScore() {
        return (double) Math.round((double) (kor + eng + math) / 3 * 10) / 10;
    }
}
