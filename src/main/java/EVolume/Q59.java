package EVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 最大报酬
 * @date 2024-12-9 14:29:23
 */
public class Q59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n = sc.nextInt();
        int[][] works = new int[n][2];
        for(int i = 0;i < n;i++){
            works[i][0] = sc.nextInt();
            works[i][1] = sc.nextInt();
        }
        int minTime = Integer.MAX_VALUE;
        for(int[] work : works){
            minTime = Math.min(minTime,work[0]);
        }
        int[][] dp =  new int[n + 1][T + 1];

        for(int i = 1;i <= n;i++){
            for(int j = minTime; j<= T;j++){
                int last = dp[i - 1][j];
            }
        }
    }
}
