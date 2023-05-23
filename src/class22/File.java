package class22;

/*
Create a class File that will have the following behaviors: open, edit, close.
Edit and close are implemented method while open is an abstract.
Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc.
*/
abstract public class File {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    abstract void open();

    void edit() {
        System.out.println("You can edit file");
    }

    void close() {
        System.out.println("File is closing");
    }

    void printInfo() {
        System.out.println(name + " " + size);
    }
}


class JavaFile extends File {

    public JavaFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("to open .java file we need IntelliJ");
    }
}

class WordFile extends File {

    public WordFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("to open .doc file we need Microsoft word to be installed");
    }
}

class PdfFile extends File {

    public PdfFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("to open .pdf file we need Adobe Reader to be installed");
    }
}

