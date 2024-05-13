package day9.fileTest;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
//        createFile();
        isHidden();
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
