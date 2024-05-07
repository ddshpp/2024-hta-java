package day1;

import java.util.Scanner;

public class PracticeProblem {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(no1());
        System.out.println(no2());
        System.out.println(no3());
        System.out.println(no4());
    }

    //125p 4-1-1
    public static boolean no1() {
        int number = Integer.parseInt(scanner.nextLine());

        return number > 10 && number < 20;
    }

    //125p 4-1-2
    public static boolean no2() {
        char inputChar = scanner.nextLine().charAt(0);

        return inputChar != ' ' && inputChar != '\t';
    }

    //125p 4-1-3
    public static boolean no3() {
        char inputChar = scanner.nextLine().charAt(0);

        return inputChar == 'x' || inputChar == 'X';
    }

    //125p 4-1-4
    public static boolean no4() {
        char inputChar = scanner.nextLine().charAt(0);
        return inputChar >= '0' && inputChar <= '9';
    }
}
