package EVolume;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author kk
 * @description 计算机网络信号强度
 * @date 2024-12-26 11:11:00
 */
public class Q68 {
    static int[] flash;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < cols;j++){
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] > 0){
                    flash = new int[]{i,j};
                }
            }
        }
        int targeti = sc.nextInt();
        int targetj = sc.nextInt();
        int[][] offset = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(flash);
        while(!queue.isEmpty()){
            int[] pos = queue.poll();
            int i = pos[0];int j = pos[1];
            if(matrix[i][j] == 1){
                break;
            }
            for(int[] direct : offset){
                int newI = i + direct[0];
                int newJ = j + direct[1];
                if(newI >= 0 && newI < rows && newJ >= 0 && newJ < cols && matrix[newI][newJ] == 0){
                    matrix[newI][newJ] = matrix[i][j] - 1;
                    queue.offer(new int[]{newI,newJ});
                }
            }
        }
        System.out.println(matrix[targeti][targetj]);

    }
}
