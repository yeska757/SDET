package class17;

public class Food {
    String name = "Pasta";


    void printFood(){
        String name = "Burgers";
        //local var are preferred by java
        System.out.println(name); // "Burgers"
        System.out.println(this.name); //"Pasta" -- with this. keyword it takes instance var
    }

    public static void main(String[] args) {
        Food food = new Food();
        food.printFood();
    }
}
