package class13;

public class Math {

    void add(int num1, int num2){
        System.out.println(num1 + num2);
    }

    void subtract(int num1, int num2){
        System.out.println(num1 - num2);
    }
    void multiply(int num1, int num2){
        System.out.println(num1 * num2);
    }

    void divide(int num1, int num2){
        System.out.println(num1 / num2);
    }


    public static void main(String[] args) {

        Math math = new Math();
        math.add(400,20);
        math.multiply(3,5);
        math.subtract(73,4);
        math.divide(100,20);





    }
}
