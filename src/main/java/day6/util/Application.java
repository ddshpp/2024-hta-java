package day6.util;

import java.time.LocalDate;
import java.util.Scanner;

public class Application {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        scanner();
//        localDate();
        splitLocalDate();

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
