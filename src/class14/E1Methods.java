package class14;

public class E1Methods {


    // void ---> return type of the method--does not return anything
       //          --other ex.of return type can be String int boolean char Dog Cat etc.
    // printWord---> it's the name of the method
    // (String word) ---> parameters/input (can be any data type or class or matter)
    // {System.out.println(word);}  ---> body of the method (can write anything)

    void printWord(String word){
        System.out.println(word);
    }




    public static void main(String[] args) {

        // we are creating an object of the E1Method class
        //in Java all the classes can be treated as data types
        // (class/name = )
        //new E1Methods()  ---> creates the object of the E1Methods class
        E1Methods obj = new E1Methods();
        obj.printWord("Java");
        //we are calling the printWord() method on obj object and passing "java" argument or input





    }
}
