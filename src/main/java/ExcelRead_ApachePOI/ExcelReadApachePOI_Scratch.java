package ExcelRead_ApachePOI;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReadApachePOI_Scratch {
    public static void main(String[] args) throws IOException {
        String sheetName = "Sheet1";
        String filePath = "./src/main/java/ExcelRead_ApachePOI/SampleExcel.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        int rows = sheet.getLastRowNum();
        int columns = sheet.getRow(1).getLastCellNum();
        for (int i = 0; i < rows; i++) {
            XSSFRow row = sheet.getRow(i);
            for (int c = 0; c < columns; c++) {
                XSSFCell cell = row.getCell(c);
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.println(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.println(cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.println(cell.getBooleanCellValue());
                }
            }
            System.out.println();


        }

    }
}


