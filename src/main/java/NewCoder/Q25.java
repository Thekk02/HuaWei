package NewCoder;

import DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 二叉树的后序遍历
 * @date 2024-12-12 10:48:30
 */
public class Q25 {
    public int[] postorderTraversal (TreeNode root) {
        // write code here
        if(root == null){
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        backorder(root,list);
        int[] ans = new int[list.size()];
        for(int i = 0;i < list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

    public void backorder(TreeNode node, List<Integer> list){
        if(node.left != null){
            backorder(node.left,list);
        }
        if(node.right != null){
            backorder(node.right,list);
        }
        list.add(node.val);
    }
}
