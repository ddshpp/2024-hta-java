package day1;

import java.util.Scanner;

public class Hello4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println(test1());
//        System.out.println(test2());
//        System.out.println(test3());
//        System.out.println(test4());
    }

    //125p 4-1-1
    public static boolean test1() {
        int number = Integer.parseInt(scanner.nextLine());

        if (number > 10 && number < 20) {
            return true;
        }
        return false;
    }

    //125p 4-1-2
    public static boolean test2() {
        char inputChar = scanner.nextLine().charAt(0);

        if (inputChar == ' ' || inputChar == '\t') {
            return false;
        }
        return true;
    }

    //125p 4-1-3
    public static boolean test3() {
        char inputChar = scanner.nextLine().charAt(0);

        if (inputChar == 'x' || inputChar == 'X') {
            return true;
        }
        return false;
    }

    //125p 4-1-4
    public static boolean test4() {
        char inputChar = scanner.nextLine().charAt(0);
        if (inputChar >= '0' && inputChar <= '9') {
            return true;
        }
        return false;
    }
}
