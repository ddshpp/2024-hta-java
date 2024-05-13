package day9.fileTest;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        createFile();
    }

    private static void createFile() throws IOException {
        String folderPath = "/Users/sanghoonpark/Desktop/ddshpp/study-hta/file-test";
        String fileName = "Test1.txt";

        File file = new File(folderPath, fileName);

        boolean newFile = file.createNewFile();
        if (!newFile) {
            throw new RuntimeException("생성실패~!!!");
        }
    }
}
