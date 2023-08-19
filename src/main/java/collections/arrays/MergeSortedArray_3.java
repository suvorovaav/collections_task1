package collections.arrays;

import java.util.Arrays;

/**
 *You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 *  representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */

public class MergeSortedArray_3 {
    public static void main(String[] args){
        int[] nums1 = {0,0,0,0,0};
        int[] nums2 = {1,2,3,4,5};
//        int[] nums1 = {2, 0, 0};
//        int[] nums2 = {1, 2};

        int n = nums2.length;
        int m = nums1.length - nums2.length;
        System.out.println("n = " + n + "; m = " + m);
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        for(int k=m+n-1; k>=0; k--){
                if (i<0 || (j >= 0 && nums1[i] < nums2[j])) {
                    nums1[k] = nums2[j];
                    j--;
                } else { {
                    nums1[k] = nums1[i];
                    i--;
                }
            }
        }
    }
}
