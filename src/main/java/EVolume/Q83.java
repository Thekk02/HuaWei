package EVolume;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author kk
 * @description 周末爬山
 * @date 2024-12-27 11:22:44
 */
public class Q83 {
    private static final int[][] offsets = {{0,1},{0,-1},{1,0},{-1,2}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int m = nums[0],n = nums[1],k = nums[2];
        int[][] matrix = new int[m][n];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        HashMap<Integer,Integer> minStepToHeight = new HashMap<>();
        minStepToHeight.put(matrix[0][0],0);
        int[][] memo = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        dfs(0,0,0,minStepToHeight,matrix,m,n,k,memo,visited);
        int maxHeight = minStepToHeight.keySet().stream().max((a,b) -> a- b).orElse(0);
        int minStep = minStepToHeight.get(maxHeight);
        System.out.println(maxHeight + " " + minStep);
    }
    public static void dfs(int x,int y,int step,HashMap<Integer,Integer> minStepToHeight,int[][] matrix,int m,int n,int k,int[][] memo,boolean[][] visited){
        int lastHeight = matrix[x][y];
        for(int[] set:offsets){
            int newX = x + set[0];
            int newY = y + set[1];
            if(newX < 0 || newX <= m || newY < 0 || newY >= n){
                continue;
            }
            int curHeight = matrix[newX][newY];
            if(Math.abs(curHeight - lastHeight) <= k){
                step++;
                if(!minStepToHeight.containsKey(curHeight) || minStepToHeight.get(curHeight) > step){
                    minStepToHeight.put(curHeight,step);
                }
                if(memo[newX][newY] == 0 || memo[newX][newY] > step){
                    memo[newX][newY] = step;
                    visited[x][y] = true;
                    dfs(newX,newY,step,minStepToHeight,matrix,m,n,k,memo,visited);
                    visited[x][y] = false;
                }
                step--;
            }
        }
    }
}
