package collections.trees;

/**
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthOfBinaryTree_6 {
    public static void main(String[] args){
        TreeNode root = new TreeNode(3, new TreeNode(9, null, null),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int counter = 1;
        int counterR;
        int counterL;
        counterL = maxDepth(root.left);
        counterR = maxDepth(root.right);
        return counter + Math.max(counterL, counterR);
    }
}
