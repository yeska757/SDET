package class13HW;

public class cl13HW1reverse {

    /*How would you reverse a String word by word? for example
    // input=>This is sentence i want to reverse
    // output=>sihT si ecnetnes i tnaw ot esrever*/

    public static void main(String[] args) {


        String str = "Today I am reversing sentences";
        String[] strArr = str.split(" ");
        String rev = "";

        for (String s : strArr) {
            String reverseWord = new StringBuilder(s).reverse().toString();
            rev += reverseWord + " ";
        }

        System.out.println(rev.trim());


    }
}
