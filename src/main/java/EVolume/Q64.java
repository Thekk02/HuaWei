package EVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description MELON的难题
 * @date 2024-12-23 14:57:20
 */
public class Q64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stones = new int[n];
        for(int i = 0;i < n;i++){
            stones[i] = sc.nextInt();
        }
        int totalWeight = Arrays.stream(stones).sum();
        if(totalWeight % 2 == 1){
            System.out.println(-1);
        }else{
            int targetWeight = totalWeight / 2;
            int[] dp = new int[targetWeight + 1];
            for(int i = 1;i <= targetWeight;i++){
                dp[i] = n;
            }
            for(int i = 1;i <= n;i++){
                int weight = stones[i - 1];
                for(int j = targetWeight;j >= weight;j--){
                    dp[j] = Math.min(dp[j],dp[j - weight] + 1);
                }
            }
            if(dp[targetWeight] == n){
                System.out.println(-1);
            }else{
                System.out.println(dp[targetWeight]);
            }
        }
    }
}
