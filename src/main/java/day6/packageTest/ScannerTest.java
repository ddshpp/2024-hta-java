package day6.packageTest;

import java.util.Scanner;

public class ScannerTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        inputTest();
//        outputGugudan();
        outputGugudan2();
    }

    private static void outputGugudan2() {
        System.out.println("단을 입력해주세요");
        int inputNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < inputNumber; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + " ");
            }
            System.out.println();
        }
    }

    private static void outputGugudan() {
        System.out.println("단을 입력해주세요");
        int inputNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < 10; i++) {
            System.out.println(inputNumber + " * " + i + " = " + inputNumber * i);
        }
    }

    private static void inputTest() {
        System.out.println("아이디 입력해주세요");
        String inputId = scanner.nextLine();
        System.out.println("비밀번호 입력해주세요");
        String inputPw = scanner.nextLine();

        System.out.println("ID : " + inputId + "\nPW : " + inputPw);
    }
}
