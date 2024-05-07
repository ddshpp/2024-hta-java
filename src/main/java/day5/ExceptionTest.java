package day5;

import day5.Exception.ShpException;
import day5.Exception.ShpExceptionCode;
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
            System.out.println("숫자를 입력해주세요 문자 입력시 예외발생");
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
            System.out.println("숫자를 입력해주세요 문자 입력시 예외발생");
            int input1 = Integer.parseInt(scanner.nextLine());
            System.out.println("test3() 테스트" + input1);
        } catch (Exception e) {
            throw new RuntimeException("test3() 예외발생성공~~!!");
        } finally {
            System.out.println("test3() finally 성공~~!!");
        }
        System.out.println("test3() 종료");
    }

    public void test4() {
        System.out.println("첫번째 숫자 입력해주세요");
        int input1 = Integer.parseInt(scanner.nextLine());
        System.out.println("두번째 숫자 입력해주세요");
        int input2 = Integer.parseInt(scanner.nextLine());

        if ((input1 + input2) < 100) {
            throw new RuntimeException("두 수의 합이 100 미만이므로 탈락!!!");
        }
        System.out.println("test4() 종료");
    }

    public void test5() throws Exception {
        System.out.println("입력해주세요");
        int input1 = Integer.parseInt(scanner.nextLine());
    }

    public void test6() {
        System.out.println("100보다 작은 수 입력시 예외발생");
        int input1 = Integer.parseInt(scanner.nextLine());

        if (input1 < 100) {
            throw new ShpException(ShpExceptionCode.SHP_EXCEPTION_CODE_1);
        }
        System.out.println("test6() 종료");
    }
}
