package class17HW;

public class LevelsTest {

    //private did not access outside of the class
    public static void main(String[] args) {
        Levels level = new Levels("Name", "345678", 1999, 1998);//protected
        Levels level1 = new Levels("Name", "345678", 1999);//public
        Levels level2 = new Levels("Name", "345678");//default
      //  Levels level3 = new Levels("Name");//private
    }
}
