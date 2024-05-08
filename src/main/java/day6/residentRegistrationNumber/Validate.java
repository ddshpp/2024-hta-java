package day6.residentRegistrationNumber;

import java.util.Scanner;

public class Validate {

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력해주세요");
        String input = scanner.nextLine();

        inputLengthCheck(input);
    }

    public static void inputLengthCheck(String input) {
        if (input.length() < 14) {
            throw new RuntimeException("입력값이 너무 짧습니다.");
        }
        containsSymbol(input);
    }

    public static void containsSymbol(String input) {
        boolean contains = input.contains("-");

        if (!contains) {
            throw new RuntimeException("입력값에 '-' 이 없습니다");
        }

        symbolCount(input);
    }

    public static void symbolCount(String input) {
        int count = 0;

        for (char c : input.toCharArray()) {
            if (c == '-') {
                count++;
            }
        }

        if (count != 1) {
            throw new RuntimeException("입력값에 '-'의 갯수가 많습니다");
        }

        numberCheck(input);
    }

    public static void numberCheck(String input) {
        String[] splits = input.split("-");

        try {
            int first = Integer.parseInt(splits[0]);
            int second = Integer.parseInt(splits[1]);
        } catch (Exception e) {
            throw new RuntimeException("숫자로 입력해주세요");
        }

        String birthday = splits[0];
        birthdayCheck(birthday, splits);

        System.out.println("올바른 형식으로 입력하였습니다");
    }

    private static void birthdayCheck(String birthday, String[] splits) {
        if (birthday.length() != 6) {
            throw new RuntimeException("생년월일을 제대로 입력해주세요");
        }

        int month = Integer.parseInt(splits[0].substring(2, 4));
        int day = Integer.parseInt(splits[0].substring(4, 6));

        if (month > 12) {
            throw new RuntimeException("없는 월입니다.");
        }
        if (day > 31) {
            throw new RuntimeException("없는 일입니다.");
        }
    }
}
