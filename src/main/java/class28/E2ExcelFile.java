package class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E2ExcelFile {
    public static void main(String[] args) throws IOException {

        String path = "Files/Employees.xlsx";
        //use fileInputStream to read the existing data first and then add to it
        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Row row = sheet.createRow(5);
        row.createCell(0).setCellValue("Biscuit");
        row.createCell(1).setCellValue("Yeska");
        row.createCell(2).setCellValue("Masha");
        //creates an empty file
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        //data is written to that file
        xssfWorkbook.write(fileOutputStream);


    }
}
