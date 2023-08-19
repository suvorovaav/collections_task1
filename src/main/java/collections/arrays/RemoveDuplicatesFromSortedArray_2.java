package collections.arrays;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;


/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that
 * each unique element appears only once. The relative order of the elements should be kept the same.
 * Then return the number of unique elements in nums.
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 * Change the array nums such that the first k elements of nums contain the unique elements in the order
 * they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */

public class RemoveDuplicatesFromSortedArray_2 {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 3, 3, 4, 4};
        Pair<Integer, int[]> pair = removeDupl(array);
        System.out.println(pair.getKey());
        System.out.println(Arrays.toString(pair.getRight()));
    }

    static Pair<Integer, int[]> removeDupl(int[] nums){
        int duplicates = 0;
        int j=0;
        while (j<nums.length-1-duplicates){
            if (nums[j]==nums[j+1]){
                for (int k=j; k<nums.length-1-duplicates; k++){
                    nums[k] = nums[k+1];
                }
                nums[nums.length-1-duplicates]=0;
                duplicates++;
            } else {
                j++;
            }
        }
        return Pair.of(nums.length-duplicates, nums);
    }
}
