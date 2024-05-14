package day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class printTest {
    public static void main(String[] args) {
        inputStreamTest();
        inputStreamReaderTest();
        bufferedReaderTest();
    }

    private static void bufferedReaderTest() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("입력");

        try {
            System.out.println(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException("예외발생");
        }
    }

    private static void inputStreamReaderTest() {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        System.out.println("입력");

        try {
            System.out.println((char) inputStreamReader.read());
        } catch (IOException e) {
            throw new RuntimeException("예외발생");
        }
    }

    private static void inputStreamTest() {
        InputStream inputStream = System.in;
        System.out.println("입력");
        try {
            System.out.println(inputStream.read());
        } catch (Exception e) {
            throw new RuntimeException("예외발생");
        }
    }
}
