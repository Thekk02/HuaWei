package NewCoder;

import DataStructures.TreeNode;

/**
 * @author kk
 * @description 合并二叉树
 * @date 2024-12-12 11:02:20
 */
public class Q28 {
    public TreeNode mergeTrees (TreeNode t1, TreeNode t2) {
        // write code here
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }
        TreeNode root = new TreeNode(t1.val + t2.val);
        root.left = mergeTrees(t1.left,t2.left);
        root.right = mergeTrees(t1.right,t2.right);
        return root;

    }
}
