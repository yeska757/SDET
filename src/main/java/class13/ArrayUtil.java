package class13;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] arr = {10, 20, 45, 89};
        int[] arr1 = {12, 32, 455, 889,100};
        int number = 100;
        int number1 = 10;


/*   for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("Yes");
                break;
            }
        }
*/
 /*       for (int i = 0; i < arr.length; i++) {
            if (arr1[i] == number1) {
                System.out.println("Yes");
                break;
            }
        }
*/

        ArrayUtil findNum = new ArrayUtil();
        findNum.searchArray(arr,number1);
        findNum.searchArray(arr1,number);




    }

    void searchArray(int[]arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("Yes");
                break;
            }
        }
    }



}
