package day9.file;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class FileTest {
    public static void main(String[] args) throws IOException {
        createFile();
        isHidden();
        getCanonicalFile();
        printFileSize();
        lastModifiedConversion();
        getFileList1();
        getFileList2();
        createDirectory();
        renameDirectory();
        deleteDirectory();
    }

    private static void renameDirectory() {
        File file = new File("/Users/sanghoonpark/Desktop/ddshpp/test1");
        File renameFile = new File("/Users/sanghoonpark/Desktop/ddshpp/test100");
        file.renameTo(renameFile);
    }

    private static void deleteDirectory() {
        File file = new File("/Users/sanghoonpark/Desktop/ddshpp/test1");
        file.delete();
    }

    private static void createDirectory() {
        File file = new File("/Users/sanghoonpark/Desktop/ddshpp/test1");
        if (file.mkdir()) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }
    }

    private static void getFileList2() {
        File file = new File("/Users/sanghoonpark/Desktop/ddshpp");
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                System.out.println("[" + file1.getName() + "]");
                continue;
            }
            System.out.println(file1.getName());
        }
    }

    private static void getFileList1() {
        File file = new File("/Users/sanghoonpark/Desktop/ddshpp");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName());
        }
    }

    private static void lastModifiedConversion() {
        File file = new File("/Users/sanghoonpark/Desktop/ddshpp/study-hta/file-test/h1.jpeg");
        long lastModified = file.lastModified();
        System.out.println("lastModified :" + lastModified);

        Timestamp timestamp = new Timestamp(lastModified);
        System.out.println("timestamp : " + timestamp);

        LocalDateTime localDateTime = timestamp.toLocalDateTime();
        System.out.println("localDateTime : " + localDateTime);
    }

    private static void printFileSize() {
        String testFilePath1 = "/Users/sanghoonpark/Desktop/ddshpp/study-hta/file-test/text.txt";
        String testFilePath2 = "/Users/sanghoonpark/Desktop/ddshpp/study-hta/file-test/h1.jpeg";
        File file1 = new File(testFilePath1);
        File file2 = new File(testFilePath2);
        long fileSize1 = file1.length();
        long fileSize2 = file2.length();
        System.out.println(fileSize1);
        System.out.println(fileSize2);
    }

    private static void getCanonicalFile() throws IOException {
        String testFilePath = "/Users/sanghoonpark/Desktop/ddshpp/study-hta/file-test/text.txt";
        File file = new File(testFilePath);
        File canonicalFile = file.getCanonicalFile();
        System.out.println(canonicalFile);
    }

    private static void isHidden() {
        String testFilePath = "/Users/sanghoonpark/Desktop/ddshpp/study-hta/file-test/text.txt";
        File file = new File(testFilePath);
        boolean isHidden = file.isHidden();
        System.out.println(isHidden);
    }

    private static void createFile() throws IOException {
        String folderPath = "/Users/sanghoonpark/Desktop/ddshpp/study-hta/file-test";
        String fileName = "test.txt";

        File file = new File(folderPath, fileName);
        file.createNewFile();
    }
}
