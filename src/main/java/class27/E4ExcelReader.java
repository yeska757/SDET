package class27;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelReader {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(Constants.EXCEL_FILE_PATH);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        Row row = null;
        for (int rows = 0; rows < sheet.getPhysicalNumberOfRows(); rows++) {
            row = sheet.getRow(rows);

            for (int col = 0; col < row.getPhysicalNumberOfCells(); col++) {
                System.out.println(row.getCell(col) + " ");
            }
            System.out.println();
        }

        //   Row row = sheet.getRow(1);
        // Cell cell = row.getCell(0);
        // System.out.println(cell);


    }
}
