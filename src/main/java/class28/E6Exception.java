package class28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E6Exception {
    public static void main(String[] args) {


        try {
            FileInputStream fileInputStream = new
                    FileInputStream("C:\\Users\\Yeska\\IdeaProjects\\SDET\\Files\\Emp.xlsx");
        }catch(FileNotFoundException foundException){
            System.out.println("File is not found by the path you provided");
        }
        System.out.println("line 6");




    }
}
