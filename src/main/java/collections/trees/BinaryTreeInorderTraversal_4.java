package collections.trees;

import java.util.LinkedList;
import java.util.List;

/**
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */
public class BinaryTreeInorderTraversal_4 {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
//        TreeNode root = new TreeNode(2, new TreeNode(3, new TreeNode(1), null), null);
        System.out.println(inorderTraversal(root));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null){
            return list;
        }

        if (root.left != null){
            list.addAll(inorderTraversal(root.left));
        }
        list.add(root.val);
        if (root.right != null){
            list.addAll(inorderTraversal(root.right));
        }
        return list;
    }
}
