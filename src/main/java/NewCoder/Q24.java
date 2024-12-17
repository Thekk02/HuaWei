package NewCoder;

import DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 二叉树的中序遍历
 * @date 2024-12-12 10:43:51
 */
public class Q24 {
    public int[] inorderTraversal (TreeNode root) {
        // write code here
        if(root == null){
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        midorder(list,root);
        int[] ans = new int[list.size()];
        for(int i = 0;i < list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    public void midorder(List<Integer> list,TreeNode node){
        if(node.left != null){
            midorder(list,node.left);
        }
        list.add(node.val);
        if(node.right != null){
            midorder(list,node.right);
        }
    }

}
