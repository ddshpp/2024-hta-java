package day6.calculator.util;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public static List<String> separateString(String inputMessage) {
        String[] splits = inputMessage.split(" ");
        return new ArrayList<>(List.of(splits));
    }

    public static int conversionString(String string) {
        return Integer.parseInt(string);
    }
}
