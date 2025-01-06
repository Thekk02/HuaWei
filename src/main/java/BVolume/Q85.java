package BVolume;

import javafx.scene.transform.Scale;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description MELON的难题
 * @date 2025-1-3 09:30:46
 */
public class Q85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] stones = new int[n];
        for(int i = 0;i < n;i++){
            stones[i] = sc.nextInt();
        }
//        System.out.println(helper(n,stones));
    }
//    public static int helper(int n,int[] stones){
//        int sum = Arrays.stream(stones).sum();
//        if(sum % 2 == 1){
//            return -1;
//        }
//        int bag = sum / 2;
//        int[][] dp = new int[n + 1][bag + 1];
//        for(int i = 0;i <= bag;i++){
//            dp[0][i] = n;
//        }
//        dp[0][0] = 0;
//        for(int i = 1;i <= n;i++){
//            int num = stones[i - 1];
//            for(int j = 1;j < bag;j++){
//                if(j < num){
//                   dp[i][j] = dp[i - 1][j];
//                }else{
//                    dp[i][j] = Math.min(dp[i - 1][j],dp[i - 1][j - num] + 1);
//                }
//            }
//        }
//    }
}
