package class24;

import java.util.ArrayList;

//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
public class E12ArrayList {
    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coke");
        drinks.add("cofee");
        drinks.add("water");
        drinks.add("juice");
        drinks.add("tequilaSunrise");

       for (int i = 0; i < drinks.size(); i++) {
            String word = drinks.get(i);
            if(word.contains("e") || word.contains("a")){
                drinks.set(i, "Water");
            }
        }

       drinks.replaceAll(x-> {
           if(x.contains("a") || x.contains("e")){
               return "Water";
           }else{
               return x;
           }
       });

       drinks.replaceAll(x->x.contains("a") || x.contains("e")?"water":x);





       String word = 10>8?"Water":"milk";
                  // if condition is tru--assign Water, if false--assign milk



        System.out.println(drinks);










    }
}
