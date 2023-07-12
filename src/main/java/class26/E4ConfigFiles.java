package class26;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E4ConfigFiles {
    public static void main(String[] args) throws IOException {

        //gives the path of the project

        System.out.println(System.getProperty("user.dir"));
        String path = System.getProperty("user.dir") + "\\" + "Files\\Config.properties";
        System.out.println(path);

        FileInputStream fileInputStream = new FileInputStream(path);
        //the special class that knows how this file works
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("userName"));


    }
}
