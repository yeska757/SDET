package class9HW;

public class class9HW6arrayLoopsSum {
    public static void main(String[] args) {

        //Create an array on integers and calculate the sum of all elements in an array

        int[] num = {8, 21, 1993, 1035, 23464};

        int sum = 0;

        for (int i = 0; i < num.length; i++) {

            sum = sum + num[i];
        }
        System.out.println("The sum of all elements in an array is equals to : " + sum);


    }
}
