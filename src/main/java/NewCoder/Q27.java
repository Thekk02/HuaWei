package NewCoder;

import DataStructures.TreeNode;

/**
 * @author kk
 * @description 二叉搜索树与双向链表
 * @date 2024-12-12 10:55:41
 */
public class Q27 {
    TreeNode pre = null;
    TreeNode root = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){
            return null;
        }
        Convert(pRootOfTree.left);
        if(root == null){
            root = pRootOfTree;
        }
        if(pre != null){
            pRootOfTree.left = pre;
            pre.right = pRootOfTree;
        }
        pre = pRootOfTree;
        Convert(pRootOfTree.right);
        return root;

    }
}
