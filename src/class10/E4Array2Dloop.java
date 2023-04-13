package class10;

public class E4Array2Dloop {
    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 30},
                {20, 50, 65},
                {102, 54, 60}
        };

        for (int j = 0; j < matrix.length; j++) {     //getting a complete 1D from 2D
            int[] arr1 = matrix[j];   //[j]-->row number(0||1||2)
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
            System.out.println();
        }













    }
}
