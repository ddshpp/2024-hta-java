package day10.dataIOStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        dataOutputStreamTest();
    }

    private static void dataOutputStreamTest() {
        try {
            DataOutputStream dataInputStream = new DataOutputStream(
                    new FileOutputStream("./src/main/java/day10/dataIOStream/test1.dat"));
            dataInputStream.write(123);
            dataInputStream.write(124);
            dataInputStream.write(125);
            dataInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
