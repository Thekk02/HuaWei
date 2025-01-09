package EVolume;

import DataStructures.TreeNode;

import javax.transaction.TransactionRequiredException;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 二叉树计算
 * @date 2024-12-23 15:07:30
 */
public class Q66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] preorder = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] inorder = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        TreeNode root = build(preorder,inorder);
        updateTree(root);
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        ans.forEach(ele -> System.out.print(ele + " "));
    }
    //自定义树的类
    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val = x;
        }
    }

    //树的中序遍历
    private static void inorder(TreeNode node,ArrayList<Integer> ans){
        if(node == null){
            return;
        }
        inorder(node.left,ans);
        ans.add(node.val);
        inorder(node.right,ans);
    }

    //根据前序遍历和中序遍历恢复树
    private static TreeNode build(int[] preorder,int[] inorder){
        return buildTree(preorder,inorder,0,preorder.length - 1,0,inorder.length - 1);
    }
    private static TreeNode buildTree(int[] preorder,int[] inorder,int preorder_left,int preorder_right,int inorder_left,int inorder_right){
        if(preorder_left > preorder_right){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preorder_left]);
        int inIndex = 0;
        for(int i = 0;i < inorder_right;i++){
            if(inorder[i] == root.val){
                inIndex = i;
            }
        }
        int size_leftTree = inIndex - inorder_left;
        root.left = buildTree(preorder,inorder,preorder_left + 1,preorder_left + size_leftTree,inorder_left,inIndex - 1);
        root.right = buildTree(preorder,inorder,preorder_left + size_leftTree + 1,preorder_right,inIndex + 1,inorder_right);
        return root;
    }

    private static int updateTree(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftSum = updateTree(root.left);
        int rightSum = updateTree(root.right);
        int oldVal = root.val;
        root.val  = leftSum + rightSum;
        return root.val + oldVal;
    }

}
