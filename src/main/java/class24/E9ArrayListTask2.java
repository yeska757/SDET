package class24;

import java.util.ArrayList;

//Create an arrayList of words. Remove every word that ends with “e”.
public class E9ArrayListTask2 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Cat");
        words.add("Car");

       /* for (String word: words) {
            if(word.endsWith("e")){
                words.remove(word);
            }
        }*/

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (word.endsWith("e")) {
                words.remove(i);
                i--;
            }
        }
        System.out.println(words);


    }
}
