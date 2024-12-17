package NewCoder;

import DataStructures.TreeNode;

/**
 * @author kk
 * @description 判断是不是二叉搜索树
 * @date 2024-12-12 11:17:49
 */
public class Q34 {
    public boolean isValidBST (TreeNode root) {
        // write code here
        if(root == null || (root.left == null && root.right == null)){
            return true;
        }else if(root .left == null){
            return root.val < root.right.val && isValidBST(root.right);
        }else if(root.right == null){
            return root.left.val < root.val && isValidBST(root.left);
        }else{
            return root.left.val < root.val && root.right.val > root.val && isValidBST(root.left) && isValidBST(root.right);
        }

    }
}
