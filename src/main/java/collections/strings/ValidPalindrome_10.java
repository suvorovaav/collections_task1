package collections.strings;


/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
 * non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */

public class ValidPalindrome_10 {
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        char[] chars = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        int len = chars.length;
        int j = len-1;
        for (int i = 0; i<len/2; i++){
            if (chars[i] != chars[j]){
                return false;
            }
            j--;
        }
        return true;
    }
}
