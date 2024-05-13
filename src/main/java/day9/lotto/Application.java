package day9.lotto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("src/main/java/day9/lotto/lotto.csv/"));

        int[] numbers = new int[46];
        String readLine = bufferedReader.readLine();

        while (readLine != null) {
            String[] split = readLine.split(",");
            for (int i = 1; i < 7; i++) {
                int number = Integer.parseInt(split[i]);
                numbers[number]++;
            }
            readLine = bufferedReader.readLine();
        }

        for (int i = 1; i < 46; i++) {
            System.out.println(i + ": " + numbers[i]);
        }
    }
}
