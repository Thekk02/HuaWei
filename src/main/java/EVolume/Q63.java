package EVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description MELON的难题
 * @date 2024-12-23 14:50:39
 */
public class Q63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stones = new int[n];
        for(int i = 0;i < n;i++){
            stones[i] = sc.nextInt();
        }
        int totalWeight = 0;
        for(int i = 0;i < n;i++){
            totalWeight += stones[i];
        }
        if(totalWeight % 2 != 0){
            System.out.println(-1);
        }else{
            int targetweight = totalWeight / 2;
            int[] dp = new int[targetweight + 1];
            for(int i = 1;i <= targetweight;i++){
                dp[i] = n;
            }
            for(int i = 1;i <= n;i++){
                int weight = stones[i - 1];
                for(int j = targetweight;j >= weight;j--){
                    dp[j] = Math.min(dp[j],dp[j - weight] + 1);
                }
            }
            if(dp[targetweight] == n){
                System.out.println(-1);
            }else{
                System.out.println(dp[targetweight]);
            }
        }

    }
}
