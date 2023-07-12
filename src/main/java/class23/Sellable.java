package class23;

public interface Sellable {

    //private, protected, default  --  not allowed
    //only public, have to be initialized
    int PRICE = 12000;


    // final void sell();   ---> can't be final
    // static  void sell();   ---> can not be overridden

    static void sell() {
        System.out.println("Allowed");
    }

    ;

}

class Tester1 {
    public static void main(String[] args) {
        Sellable.sell();  //--> can be called by interface name
    }
}