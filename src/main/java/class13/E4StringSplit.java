package class13;

public class E4StringSplit {
    public static void main(String[] args) {

        String str = "Today is Sunday. We have java class? We like Java";
        String[] strArr = str.split("[.!?]"); // specify where to split
        System.out.println(strArr.length);  // prints number of sentences
        System.out.println(strArr[2].trim()); // prints third sentence and trims spaces


    }
}
