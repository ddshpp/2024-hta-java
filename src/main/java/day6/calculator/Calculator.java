package day6.calculator;

import day6.calculator.util.NumberUtils;
import day6.calculator.view.InputView;
import java.util.List;

public class Calculator {
    static InputView inputView = new InputView();

    public double calculatorStart(List<String> inputMessage) {
        System.out.println("시작");

        int firstNumber = NumberUtils.conversionString(inputMessage.get(0));
        int secondNumber = NumberUtils.conversionString(inputMessage.get(2));
        String operationSymbol = inputMessage.get(1);

        return calculation(firstNumber, secondNumber, operationSymbol);
    }

    public double calculation(int firstNumber, int secondNumber, String operationSymbol) {
        double result = 0;

        return switch (operationSymbol) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> (double) firstNumber / secondNumber;
            default -> -1;
        };
    }
}
