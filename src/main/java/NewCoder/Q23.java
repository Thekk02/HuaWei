package NewCoder;

import DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 二叉树的前序遍历
 * @date 2024-12-12 10:35:10
 */
public class Q23 {
    public int[] preorderTraversal (TreeNode root) {
        // write code here
        List<Integer> list = new ArrayList<>();
        helper(root,list);
        int[] ans = new int[list.size()];
        for(int i = 0;i < list.size() ;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    public void helper(TreeNode node,List<Integer> list){
        if(node == null){
            return;
        }
        list.add(node.val);
        helper(node.left,list);
        helper(node.right,list);

    }

}
