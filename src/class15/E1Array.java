package class15;

public class E1Array {

    // create a method that takes a number as input and creates an array of
    // ints with size give by that number fill the array with some numbers lets
    //say 10 call the method createArray
    int[] createArray(int size, int num) {
        int[] createArray = new int[size];
        for (int i = 0; i < size; i++) {
            createArray[i] = num;
        }
        return createArray;
    }

    public static void main(String[] args) {
        E1Array arr = new E1Array();
        int[]array = arr.createArray(5, 10);
       //1) System.out.println(Arrays.toString(array));
       /*2) for (int i : array) {
            System.out.println(i);
        }*/
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


}
