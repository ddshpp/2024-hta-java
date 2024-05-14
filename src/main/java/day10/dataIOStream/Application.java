package day10.dataIOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Application implements Serializable {
    public static void main(String[] args) {
//        dataOutputStreamTest();
//        objectIOStreamTest();
        objectIOStreamTes2();
    }

    private static void objectIOStreamTes2() {
        String path = "./src/main/java/day10/dataIOStream/test3.ser";

        try {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream(path)))) {

                StrongMan strongMan1 = new StrongMan("테스트111", 16, 1000);
                StrongMan strongMan2 = new StrongMan("테스트222", 16, 2000);

                List<StrongMan> strongManList = new ArrayList<>();
                strongManList.add(strongMan1);
                strongManList.add(strongMan2);

                objectOutputStream.writeObject(strongMan1);
                objectOutputStream.writeObject(strongMan2);
                objectOutputStream.writeObject(strongManList);
            }
            System.out.println("잘끝남요");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new BufferedInputStream(new FileInputStream(path)));

            StrongMan object1 = (StrongMan) objectInputStream.readObject();
            StrongMan object2 = (StrongMan) objectInputStream.readObject();
            List<StrongMan> objectList = (List<StrongMan>) objectInputStream.readObject();

            object1.getInfo();
            object2.getInfo();
            for (StrongMan strongMan : objectList) {
                strongMan.getInfo();
            }
            objectInputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
