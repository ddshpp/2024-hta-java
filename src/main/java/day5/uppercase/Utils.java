package day5.uppercase;

public class Utils {

    public static String transformation1(String input) {
        input = input.trim();
        String[] split = input.split(" ");
        String result = "";

        for (int i = 0; i < split.length; i++) {
            String str = split[i];

            result += str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase() + " ";
        }

        return result;
    }
}
