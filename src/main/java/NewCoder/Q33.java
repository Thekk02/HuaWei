package NewCoder;

import DataStructures.TreeNode;
import sun.awt.image.ImageWatched;

import java.util.LinkedList;

/**
 * @author kk
 * @description 二叉树的镜像
 * @date 2024-12-12 11:07:33
 */
public class Q33 {
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if(pRoot == null){
            return null;
        }
        TreeNode temp = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = temp;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }
}
