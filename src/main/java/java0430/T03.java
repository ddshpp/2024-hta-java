package java0430;

public class T03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 10;
        int b = 3;
        double c = 3.0;
        double d = 5.0;

        int result1 = calculator.multiply(a, b);
        double result2 = calculator.multiply(a, c);
        double result3 = calculator.Multiplication(a, c);
        int result4 = calculator.Multiplication(a, b);
        double result5 = calculator.divide(a, b);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
