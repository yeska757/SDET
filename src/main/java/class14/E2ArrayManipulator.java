package class14;

public class E2ArrayManipulator {

    //create method that will take int array call it sumArr and
    // return the sum of the elements from that array
    // create the object of the class and call the method

    /*
    return type ---> int
    name of the method --> sumArr
    parameters --> (int [] arr
    body--> {go thru the element of the array add the return the result}
     */
    int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        E2ArrayManipulator sum = new E2ArrayManipulator();
        int[] array = {8, 21, 19, 93, 69, 420};
        int result = sum.sumArray(array);
        System.out.println(result);


    }

}
