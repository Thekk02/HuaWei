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
       int num = sc.nextInt();
       int[] nums = new int[num];
       int sum = 0;
       for(int i = 0;i < num;i++){
           nums[i] = sc.nextInt();
           sum += nums[i];
       }
       if(sum % 2 == 1){
           System.out.println(-1);
       }else{
           int target = sum / 2;
           int[] dp = new int[target + 1];
           for(int i = 1;i <= target;i++){
               dp[i] = num;
           }
           for(int i = 1;i <= num;i++){
               int weight = target - nums[i - 1];
               for(int j = target;j >= weight;j--){
                   dp[j] = Math.min(dp[j],dp[j - weight] + 1);
               }
           }
           if(dp[target] == num){
               System.out.println(-1);
           }else{
               System.out.println(dp[target]);
           }
       }
    }
}
