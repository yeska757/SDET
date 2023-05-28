package class14;

public class E5ArrayUtils {

    boolean contains(int[] array, int number) {
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }

}

