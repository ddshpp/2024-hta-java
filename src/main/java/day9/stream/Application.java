package day9.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/sanghoonpark/Desktop/ddshpp/study-hta/java1/java-1/src/main/java/day9/stream/test.txt";

        fileInputStreamTest(filePath);
    }

    private static void fileInputStreamTest(String filePath) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found" + e.getMessage());
        } catch (IOException e) {
            System.out.println("io exception" + e.getMessage());
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}