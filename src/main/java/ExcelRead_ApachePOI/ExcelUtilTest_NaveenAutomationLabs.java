package ExcelRead_ApachePOI;


import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtilTest_NaveenAutomationLabs {
    public static void main(String[] args) throws IOException, NullPointerException {

String filePath="./src/main/java/ExcelRead_ApachePOI/SampleExcel.xlsx";
        Xls_Reader reader = new Xls_Reader(filePath);
        String sheetName = "Sheet1";
        if (reader.isSheetExist(sheetName)) {
            String username = reader.getCellData(sheetName, 0, 2);
            String password = reader.getCellData(sheetName,"password",2);
            System.out.println(username+"  "+password);
            System.out.println(reader.getRowCount(sheetName));
            //reader.addColumn(sheetName,"status");
            //reader.addSheet("Registration");
            reader.setCellData(sheetName,"username",4,"Akshat");
            reader.setCellData(sheetName,"password",4,"Test12345");
        }


    }
}


