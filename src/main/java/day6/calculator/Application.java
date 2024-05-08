package day6.calculator;

import day6.calculator.view.InputView;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        InputView inputView = new InputView();

        double result = calculator.calculatorStart(inputView.inputMessage());
        System.out.println(result);
    }
}
