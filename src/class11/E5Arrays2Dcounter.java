package class11;

public class E5Arrays2Dcounter {
    public static void main(String[] args) {


        int[][] arr2D = {{10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };


        //with the help of loop count how many numbers in above array are even

        int count = 0;
        for (int[] arr1D : arr2D) {
            for (int num : arr1D) {
                if (num % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println("count = " + count);    //soutv



    }
}
