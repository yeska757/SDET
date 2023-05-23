package groupProject2.task4;

/*
4. Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams,
    meaning they contain the same characters in a different order.
    For example, "listen" and "silent" are anagrams.
*/
public class Anagram {
    public static void main(String[] args) {

        String str1 = "triangle";
        String str2 = "integral";
        String checkStr = "";

        if (str1.length() != str2.length()) {
            System.out.println(str1 + " is not an Anagram of " + str2);
        }

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    checkStr += str1.charAt(i);
                }
            }
        }
        if (str1.equals(checkStr)) {
            System.out.println(str1 + " is an Anagram of " + str2);
        } else {
            System.out.println(str1 + " is not an Anagram of " + str2);
        }
    }
}
