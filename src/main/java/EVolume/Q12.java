package EVolume;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author kk
 * @description 服务器广播需要广播的服务器数量
 * @date 2024-12-5 14:59:52
 */
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] first = sc.nextLine().split(" ");
        int n = first.length;
        int[][] matrix = new int[n][n];
        for(int i = 0;i < n;i++){
            matrix[0][i] = Integer.parseInt(first[i]);
        }
        for(int i = 1;i < n;i++){
            String[] arr = sc.nextLine().split(" ");
            for(int j = 0;j < n;j++){
                matrix[i][j] = Integer.parseInt(arr[j]);
            }
        }

        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0;i < n;i++){
            if(!queue.contains(i)){
                dfs(matrix,queue,i);
                count++;
            }
        }
        System.out.println(count);

    }
    //深度优先搜索函数，递归查找服务器得所有联通节点
    public static void dfs(int[][] arr,Queue<Integer> queue,int index){
        queue.offer(index);
        for(int i = index + 1;i < arr.length;i++){
            if(arr[index][i] == 1 && !queue.contains(i)){
                dfs(arr,queue,i);
            }
        }
    }
}
