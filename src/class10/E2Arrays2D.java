package class10;

public class E2Arrays2D {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        matrix[0][0] = 10;
        matrix[1][1] = 10;
        matrix[2][2] = 10;

       // System.out.println(matrix[1][3]);  // error -->out of bound (max index is 2)
        System.out.println(matrix[2][1]);


    }
}
