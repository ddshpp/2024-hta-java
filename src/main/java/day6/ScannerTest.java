package day6;

import java.util.Scanner;

public class ScannerTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("아이디 입력해주세요");
        String inputId = scanner.nextLine();
        System.out.println("비밀번호 입력해주세요");
        String inputPw = scanner.nextLine();

        System.out.println("ID : " + inputId + "\nPW : " + inputPw);
    }
}
