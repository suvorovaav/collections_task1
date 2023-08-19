package collections.arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 */

public class IntersectionOfTwoArrays_14 {
    public static void main(String[] args){
//        int[] nums1 = {4,9,5};
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        for (int i: nums1){
            list.add(i);
        }
        for (int i: nums2){
            list2.add(i);
        }
        int k = 0;
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        for (Integer integer : list) {
            if (list2.contains(integer)) {
                result[k] = integer;
                list2.remove(integer);
                k++;
            }
        }
        int[] trimmedResult = new int[k];
        System.arraycopy(result, 0, trimmedResult, 0, k);
        return trimmedResult;
    }
}
