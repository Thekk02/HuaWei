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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] signalStrength = new int[m * n];
        Queue<int[]> sourcePosition = new LinkedList<>();
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                signalStrength[i*n + j] = sc.nextInt();
                if(signalStrength[i * n + j] > 0){
                    sourcePosition.offer(new int[]{i,j});
                }
            }
        }
        while(!sourcePosition.isEmpty()){
            int[] pos = sourcePosition.poll();
            int i = pos[0], j = pos[1];
            if(signalStrength[i * n + j] == 1){
                break;
            }
            int[][] directions = {{-1,0},{1,0},{0,1},{0,-1}};
            for(int[] direction : directions){
                int newI = i + direction[0],newJ = j + direction[1];
                if(newI >= 0 && newI < m && newJ >= 0 && newJ < n && signalStrength[newI * n + newJ] == 0){
                    signalStrength[newI * n + newJ] = signalStrength[i * m + j] - 1;
                    sourcePosition.offer(new int[]{newI,newJ});
                }
            }
        }
        int targetm = sc.nextInt(),targetn = sc.nextInt();
        System.out.println(signalStrength[targetm * n + targetn]);
    }
}
