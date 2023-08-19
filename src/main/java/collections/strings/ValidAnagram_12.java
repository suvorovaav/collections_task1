package collections.strings;

import java.util.Arrays;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */

public class ValidAnagram_12 {
    public static void main(String[] args){
//        String s = "anagram";
//        String t = "nagaram";
        String s = "aabbbb";
        String t = "aaaabb";
        System.out.println(isAnagramSort(s, t));
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() == t.length()){
            while (s.length() != 0){
                int indexT = t.indexOf(s.charAt(0));
                int indexS = s.indexOf(t.charAt(0));
                if(indexT == -1 || indexS == -1){
                    return false;
                }
                if (s.charAt(0) != t.charAt(0)){
                    t = t.substring(0, indexT) + t.substring(indexT+1);
                    s = s.substring(0, indexS) + s.substring(indexS+1);
                }
                t = t.substring(1);
                s = s.substring(1);
            }
            return true;
        }
        return false;
    }

    // with Arrays.sort()
    public static boolean isAnagramSort(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
}
