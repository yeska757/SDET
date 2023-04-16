package class11;

public class E7Arrays2DbooleanCount {
    public static void main(String[] args) {


        boolean[][] arr2D = {
                {true, false, true, true, false},
                {true, false, false, false, false}

        };


        //with the help of loop count how many times we have true in above 2D array

        int count = 0;
        for (boolean[] arr1D : arr2D) {
            for (boolean bool : arr1D) {
                if (bool) {
                    count++;

                }
            }
        }
        System.out.println(count);


    }
}
