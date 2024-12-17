package NewCoder;

import DataStructures.TreeNode;

/**
 * @author kk
 * @description 二叉树的最大深度
 * @date 2024-12-12 10:52:22
 */
public class Q26 {
    public int maxDepth (TreeNode root) {
        // write code here
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
