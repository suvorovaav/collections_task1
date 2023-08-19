package collections.trees;

import java.util.Arrays;

/**
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a
 * height-balanced binary search tree.
 */

public class SortedArrayToBinarySearchTree_7 {
    public static void main(String[] args){
        int[] nums = {-10, -3, 0, 5, 9};
//        int[] nums = {5, 10, 12, 20, 22,
//                25,
//                28, 30, 36, 38, 40, 48};
        TreeNode root = sortedArrayToBST(nums);

    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums != null && nums.length != 0){
            int length = nums.length / 2;
            TreeNode root = new TreeNode(nums[length]);

            int[] arr1 = Arrays.copyOfRange(nums, 0, length);
            int[] arr2 = Arrays.copyOfRange(nums, length + 1, nums.length);
            root.left = sortedArrayToBST(arr1);
            root.right = sortedArrayToBST(arr2);
            return root;
        }
        return null;
    }
}
