package groupProject2.task5;

/*
5. Find the First Non-Repeating Character in a String: Given a string,
        find and return the first non-repeating character. For example, in the
        string "abracadabra", the first non-repeating character is 'c'.
*/

public class NonRepeating {
    public static void main(String[] args) {
        String str1 = "abracadabra";
        char nonRep = ' ';
        boolean isRepeated = false;

        for (int i = 0; i < str1.length(); i++) {
            isRepeated = false;
            for (int j = 0; j < str1.length(); j++) {
                if (i != j && str1.charAt(i) == str1.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                nonRep = str1.charAt(i);
                break;
            }
        }
        System.out.println(nonRep);
    }
}
