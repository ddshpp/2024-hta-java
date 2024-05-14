package day10.dataIOStream;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Application implements Serializable {
    public static void main(String[] args) {
        dataOutputStreamTest();
        objectIOStreamTest();
    }

    private static void objectIOStreamTest() {
        StrongMan strongMan1 = new StrongMan("테스트1", 16, 1000);

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("./src/main/java/day10/dataIOStream/test2.ser"));
            objectOutputStream.writeObject(strongMan1);
            objectOutputStream.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream("./src/main/java/day10/dataIOStream/test2.ser"));
            StrongMan object = (StrongMan) objectInputStream.readObject();
            System.out.println(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
