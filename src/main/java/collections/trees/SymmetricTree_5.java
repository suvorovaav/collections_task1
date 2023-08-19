package collections.trees;

public class SymmetricTree_5 {
    public static void main(String[] args){
//        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
//                new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        TreeNode root = new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(5), null));
        System.out.println(isSymmetric(root));
    }

    public static boolean isSymmetric(TreeNode root) {
        boolean sim = true;
        if (root.left != null && root.right != null){
            if (root.left.val!=root.right.val){
                return false;
            }
            sim = sim && isSymmetric(new TreeNode(0, root.left.right, root.right.left));
            sim = sim && isSymmetric(new TreeNode(0, root.left.left, root.right.right));
        } else return root.left == null && root.right == null;
        return sim;
    }
}
