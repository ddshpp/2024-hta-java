package day10.streamTest;

import java.io.FileInputStream;

public class Application {
    public static void main(String[] args) {
        fileInputStreamTest();
    }

    private static void fileInputStreamTest() {
        String filePath = "src/main/java/day10/streamTest/test1.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println("fileInputStreamTest 실패");
        }
    }
}
