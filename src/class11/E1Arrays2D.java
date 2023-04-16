package class11;

public class E1Arrays2D {
    public static void main(String[] args) {

        /*
        2D arrays syntax:

        data type [][] variableName = new data type [size of rows][size of columns];

        or

         data type [][] variableName = {{element1, element2,element3},
                                         {element11, element2}};
         */


        int[][] arr = {{10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };


        // print odd numbers from 2D array using loop
        // arr[i] => gives me the array at specific index


        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]%2==1){
                    System.out.print(arr[row][col]);
                }

            }
        }


    }
}
