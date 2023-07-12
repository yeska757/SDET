package class12;

public class E8StringStartsWith {
    public static void main(String[] args) {


        // System.out.println(sentence.startsWith("Python"));//False --> checks first word
        //  System.out.println(sentence.startsWith("Java"));//True

        String sentence = "Java is very very easy";
        sentence = sentence.trim().toLowerCase();  //string chaining
        System.out.println(sentence);

        System.out.println(sentence.startsWith("java"));//True


    }
}
