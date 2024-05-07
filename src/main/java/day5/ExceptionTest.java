package day5;

import java.util.Scanner;

public class ExceptionTest {

    Scanner scanner = new Scanner(System.in);

    //throw new
    public void test1() {
        System.out.println("첫번째 숫자 입력해주세요");
        int input1 = Integer.parseInt(scanner.nextLine());
        System.out.println("두번째 숫자 입력해주세요");
        int input2 = Integer.parseInt(scanner.nextLine());

        if (input1 > input2) {
            throw new RuntimeException("test1() 예외발생성공~~!!");
        }
        System.out.println("test1() 종료");
    }

    //try / catch
    public void test2() {
        try {
            System.out.println("첫번째 숫자 입력해주세요");
            int input1 = Integer.parseInt(scanner.nextLine());
            System.out.println("test2() 테스트" + input1);
        } catch (Exception e) {
            throw new RuntimeException("test2() 예외발생성공~~!!");
        }
        System.out.println("test2() 종료");
    }

    //finally
    public void test3() {
        try {
            System.out.println("첫번째 숫자 입력해주세요");
            int input1 = Integer.parseInt(scanner.nextLine());
            System.out.println("test3() 테스트" + input1);
        } catch (Exception e) {
            throw new RuntimeException("test3() 예외발생성공~~!!");
        }finally {
            System.out.println("test3() finally 성공~~!!");
        }
        System.out.println("test3() 종료");
    }
}
