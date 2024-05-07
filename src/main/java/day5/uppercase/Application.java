package day5.uppercase;

import java.util.Scanner;

public class Application {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        transformationTest();
    }

    private static void transformationTest() {
        System.out.println("영어 이름 아무거나 입력해주세요");
        String input = SCANNER.nextLine();
        System.out.println(Utils.transformation1(input));
    }
}
