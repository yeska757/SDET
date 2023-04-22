package class12;

public class E14StringSubstring {
    public static void main(String[] args) {

        String sentence = "yep we have another class";
        System.out.println(sentence.substring(7));  //prints all after beginning index
        System.out.println(sentence.substring(4, 11)); // we have  --> from,to indexes
        System.out.println(sentence.substring(12, 19));

        int startIndex = sentence.length() - 5;
        System.out.println(sentence.substring(startIndex)); //last 5 letters


    }
}
