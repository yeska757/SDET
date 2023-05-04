package myPractice;

class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        mystery(a);
        // should print out 10 1 30 2 50
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void mystery(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = array[i] / 2;
            } else {
                array[i] = array[i] * 10;
            }
            System.out.println(array[i] + " ");
        }

    }
}