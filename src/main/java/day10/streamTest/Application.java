package day10.streamTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
//        fileInputStreamTest();
        fileInputStreamTest2();
        fileInputStreamTest3();
    }

    private static void fileInputStreamTest3() {
        String filePath = "src/main/java/day10/streamTest/test.txt";
        File file = new File(filePath);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.append("asdasd");
            bw.append("qweqwe");
            System.out.println("출력완료");
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void fileInputStreamTest2() {
        String filePath = "src/main/java/day10/streamTest/test.txt";
        File file = new File(filePath);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("asdasd");
            bw.write("qweqwe");
            System.out.println("출력완료");
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
