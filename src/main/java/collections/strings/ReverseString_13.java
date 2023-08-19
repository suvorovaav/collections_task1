package collections.strings;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */

public class ReverseString_13 {
    public static void main(String[] args){
        char[] chars = new char[]{'h','e','l','l','o'};
        reverseString(chars);
        System.out.println(chars);
    }

    public static void reverseString(char[] s) {
        int j = s.length-1;
        char buff;
        for (int i=0; i<s.length/2; i++){
            buff = s[i];
            s[i] = s[j];
            s[j] = buff;
            j--;
        }
    }
}
