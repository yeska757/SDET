package class9;

public class E4Arrays {
    public static void main(String[] args) {

        String[] names = {"Biscuit", "Masha", "Cat", "Dog", "Bird"};
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.println();

        int j = 0;
        while (j < names.length) {
            System.out.print(names[j] + " ");
            j++;
        }


    }
}
