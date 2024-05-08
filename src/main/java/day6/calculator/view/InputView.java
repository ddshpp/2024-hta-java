package day6.calculator.view;

import day6.calculator.util.NumberUtils;
import java.util.List;
import java.util.Scanner;

public class InputView {
    static Scanner scanner = new Scanner(System.in);

    public List<String> inputMessage() {
        System.out.println("입력해보센");
        String inputMessage = scanner.nextLine();
        return NumberUtils.separateString(inputMessage);
    }
}
