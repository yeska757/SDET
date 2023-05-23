package class22;

public class FileTester {
    public static void main(String[] args) {
        File[] files = {new JavaFile("JAVA", 69),
                new WordFile("word", 420),
                new PdfFile("PDF", 757)};

        for (File file : files) {
            file.open();
            file.edit();
            file.close();
            file.printInfo();

        }
    }
}
