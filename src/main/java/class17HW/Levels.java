package class17HW;

public class Levels {
    /*  Write a java class that have 4 constructors with 4 different access levels of constructors
            (private,public,default,protected) and create 4 objects of this class:
             1 - inside same class;
             2 - from outside the class;
             3 - from different class inside different package and observe the result.
    */
    String name;
    String serialNo;
    int size;
    int year;
    int num;

    private Levels(String name) {
        this.name = name;
    }

    Levels(String name, String serialNo) {
        this.name = name;
        this.serialNo = serialNo;
    }

    public Levels(String name, String number, int size) {
        this.name = name;
        this.serialNo = number;
        this.size = size;
    }

    protected Levels(String name, String number, int size, int year) {
        this.name = name;
        this.serialNo = number;
        this.size = size;
        this.year = year;
    }

 /*   static Levels(String name, String number, int size, int year, int num) {
        this.name = name;
        this.serialNo = number;
        this.size = size;
        this.year = year;
        this.num = num;
    }
static constructor not allowed*/

    public static void main(String[] args) {
        //  Levels level0 = new Levels("Name", "345678", 1999, 1998);//static
        Levels level = new Levels("Name", "345678", 1999, 1998);//protected
        Levels level1 = new Levels("Name", "345678", 1999);//public
        Levels level2 = new Levels("Name", "345678");//default
        Levels level3 = new Levels("Name");//private
    }

}


