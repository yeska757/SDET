package class14;

public class E8TaskPalindrome {

    boolean isPalindrome(String str) {

        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }
        boolean isStrPalindrome = false;
        if (str.equalsIgnoreCase(reversedStr)) {
            isStrPalindrome = true;
        }
        return isStrPalindrome;
    }

    public static void main(String[] args) {

        E8TaskPalindrome task1 = new E8TaskPalindrome();
        boolean result = task1.isPalindrome("Madam");
        System.out.println(result);


    }


}
