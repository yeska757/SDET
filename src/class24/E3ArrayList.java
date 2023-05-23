package class24;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList<Character>character = new ArrayList<>();
        character.add('Y');
        character.add('E');
        character.add('S');
        System.out.println(character.indexOf('E'));
        System.out.println(character.contains('Y'));
        System.out.println(character.isEmpty());
        character.set(1,'A');   //replaces the character at spec index
        System.out.println(character);











    }
}
