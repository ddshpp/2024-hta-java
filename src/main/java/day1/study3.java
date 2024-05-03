package day1;

import java.util.Scanner;

public class study3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //점수 입력받아 성적출력하기 (if else)
        String result = test1();
        System.out.println(result);

        //점수 입력받아 성적출력하기 (switch)
        String result2 = test2();
        System.out.println(result2);

        //월 입력받아 계절출력하기
        String result3 = test3();
        System.out.println(result3);

        //반복문
        test4();

        //별찍기
        star1();
        star2();

        //알파벳 찍기
        test5();
    }

    private static void test5() {
        char char1 = 'A';
        for (int i = 0; i < 10; i++) {
            System.out.println("char : " + char1 + ", (int)char : " + (int) char1);
            char1++;
        }
    }

    private static void star2() {
        String star = "*";
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }

    private static void star1() {
        String star = "*";
        for (int i = 0; i < 5; i++) {
            System.out.println(star);
            star += "*";
        }
    }

    private static void test4() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.println("i : " + i + " , sum : " + sum);
        }
    }

    public static String test1() {
        System.out.println("test1 : 숫자입력해보셈");
        int inputScore = Integer.parseInt(scanner.nextLine());

        if (inputScore >= 90) {
            return "A";
        } else if (inputScore >= 80) {
            return "B";
        } else if (inputScore >= 70) {
            return "C";
        } else if (inputScore >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static String test2() {
        System.out.println("test2 : 숫자입력해보셈");
        int inputScore = Integer.parseInt(scanner.nextLine());

        return switch (inputScore / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
    }

    public static String test3() {
        System.out.println("test3 : 월 입력해보셈");
        int inputMonth = Integer.parseInt(scanner.nextLine());

        return switch (inputMonth) {
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            case 12, 1, 2 -> "겨울";
            default -> "입력 똑바로 해주세요!!!!!!!!!!!!!!!";
        };
    }
}