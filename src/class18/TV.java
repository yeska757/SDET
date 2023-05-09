package class18;

public class TV {
  private  int size;
   protected String make; // ---> protected allows only to child classes that extend TV class
    protected String model;

}
class SamsungTV extends TV{


}

class TVTester{
    public static void main(String[] args) {
        SamsungTV sm = new SamsungTV();
        sm.make = "Samsung";
        //sm.size ---> is private
    }
}
