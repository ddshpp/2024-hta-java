package day9.format;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatTest {
    public static void main(String[] args) {
        printfTest();
        decimalFormatTest1();
        decimalFormatTest2();
    }

    private static void decimalFormatTest2() {
        DecimalFormat decimalFormat1 = new DecimalFormat("#,###.##");
        DecimalFormat decimalFormat2 = new DecimalFormat("#.###E0");
        try {
            Number number1 = decimalFormat1.parse("1,234,567.89");
            System.out.print("1,234,567.89" + " -> ");

            double number2 = number1.doubleValue();
            System.out.print(number2 + " -> ");

            System.out.println(decimalFormat2.format(number1));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    private static void decimalFormatTest1() {
        double number = 1234567.89;

        String[] pattern = {
                "0",
                "#",
                "0.0",
                "#.#",
                "0.000",
                "#.###",
                "#,###.###",
                "#E0",
                "0E0",
                "#.#%",
                "¤ #,###"
        };

        for (String string : pattern) {
            DecimalFormat df = new DecimalFormat(string);
            System.out.printf("%10s: %s\n", string, df.format(number));
        }
    }

    private static void printfTest() {
        System.out.printf("%s-%s", "printf", "테스트");
    }
}
