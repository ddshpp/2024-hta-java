package day9.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Application {
    public static void main(String[] args) throws IOException {
        fileInputStreamTest();
        textFileWriteTest1();
        textFileWriteTest2();
    }

    private static void textFileWriteTest2() throws IOException {
        String filePath = "src/main/java/day9/stream/test3.txt";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(filePath)));

        String input = br.readLine();
        while (!input.equals("-1")) {
            bw.write(input+"\n");
            input = br.readLine();
        }

        br.close();
        bw.close();
    }

    private static void textFileWriteTest1() {
        String filePath = "src/main/java/day9/stream/test2.txt";

        try {
            FileOutputStream outputStream = new FileOutputStream(filePath);
            outputStream.write('d');
            outputStream.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void fileInputStreamTest() {
        String filePath = "src/main/java/day9/stream/test.txt";
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
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}