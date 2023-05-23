package groupProject2.task3;

/*
3. Count the Number of Words in a String: Write a function to count the
        number of words in a given string. Words are separated by spaces or
        punctuation. For example, the input "Hello, world!" should return 2.
*/
public class NumberOfWords {

    public int len(String sentence) {
        System.out.println("Number of words in a given string : " + sentence + " is : ");
        return sentence.split(" ").length;
    }


}

