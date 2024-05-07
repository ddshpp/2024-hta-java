package day5.uppercase;

public class Utils {

    public static String transformation1(String input) {
        input = input.trim();
        String[] splits = input.split(" ");
        String result = "";

        for (String str : splits) {
            result += str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase() + " ";
        }

        return result.trim();
    }
}
