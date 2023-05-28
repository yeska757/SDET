package class10;

public class E5Arrays2Dloop {
    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 30, 40, 50},
                {20, 50, 65},
                {102, 54, 60},
                {20, 55}
        };

        for (int row = 0; row < matrix.length; row++) {
            int[] arr = matrix[row];      //pulls out a single complete row (This line not needed)
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }


    }
}
