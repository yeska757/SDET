package myPractice;

class Main {
    static int countVowels(String s) {
        String onlyVowels = s.replaceAll("[^aeiou]", "");
        return onlyVowels.length();
    }


    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}