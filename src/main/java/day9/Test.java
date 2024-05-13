package day9;

import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        printfTest();
        decimalFormatTest();
    }

    private static void printfTest() {
        System.out.printf("%s-%s", "printf", "테스트");
    }

    private static void decimalFormatTest() {
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
}
