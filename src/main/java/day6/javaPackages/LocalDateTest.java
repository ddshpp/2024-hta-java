package day6.javaPackages;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class LocalDateTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        scanner();
//        localDate();
//        splitLocalDate();
        testLocalDateMethod();
    }

    private static void testLocalDateMethod() {
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        Month month = localDate.getMonth();
        int day = localDate.getDayOfMonth();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        System.out.println(year + " " + month + " " + day);
        System.out.println("dayOfWeek : " + dayOfWeek);

        int lengthOfMonth = localDate.lengthOfMonth();
        System.out.println("lengthOfMonth : " + lengthOfMonth);
    }

    private static void splitLocalDate() {
        String localDate = String.valueOf(LocalDate.now());
        String[] splits = localDate.split("-");
        System.out.println(splits[0] + " 년");
        System.out.println(splits[1] + " 월");
        System.out.println(splits[2] + " 일");
    }

    private static void localDate() {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate : " + localDate);
    }

    private static void scanner() {
        System.out.println("입력해주세요");
        String input = scanner.nextLine();
        System.out.println("입력값 : " + input);
    }
}
