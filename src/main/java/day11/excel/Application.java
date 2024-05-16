package day11.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Application {
    static String test1Path = "src/main/java/day11/excel/files/test1.xlsx";
    static String test2Path = "src/main/java/day11/excel/files/test2.xls";

    public static void main(String[] args) throws Exception {
        getCellXlsFile();
        printXlsxTest();
        sheetRenameTest();
    }

    private static void sheetRenameTest() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File(test1Path));
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("create1");

        workbook.write(fos);
    }

    private static void printXlsxTest() throws IOException {
        try (FileInputStream fis = new FileInputStream(new File(test1Path))) {
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            XSSFCell cell = sheet.getRow(0).getCell(0);
            System.out.println(cell);
        }
    }

    private static void getCellXlsFile() {
        File file = new File(test2Path);

        try {
            FileInputStream fis = new FileInputStream(file);
            HSSFWorkbook workbook = new HSSFWorkbook(fis);
            HSSFSheet sheet = workbook.getSheetAt(0);
            HSSFCell cell = sheet.getRow(0).getCell(0);

            System.out.println("workbook.getNumberOfSheets() : " + workbook.getNumberOfSheets());
            System.out.println("sheet.getSheetName() : " + sheet.getSheetName());
            System.out.println("cell : " + cell);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
