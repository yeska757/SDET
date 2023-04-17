package groupProject;

public class task8maxMin {
    public static void main(String[] args) {

        // 8. Maximum and minimum number in the array?

        int[] num = {57, 42, 84, 19, 73, 11, 96, 66, 38, 50};

        int maximum = num[0];
        int minimum = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > maximum) {
                maximum = num[i];
            }
            if (num[i] < minimum) {
                minimum = num[i];
            }
        }
        System.out.println("Maximum number in an array is : " + maximum);
        System.out.println("Minimum number in an array is : " + minimum);


    }
}
