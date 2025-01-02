package BVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 玩牌高手
 * @date 2025-1-2 12:14:33
 */
public class Q61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] dp = new int[nums.length];
        dp[0] = nums[0] > 0 ? nums[0] : 0;
        int ans = dp[0];
        for(int i = 1;i < dp.length;i++){
            if(i < 3){
                if(dp[i - 1] + nums[i] <= 0){
                    dp[i] = 0;
                    ;
                }else{
                    dp[i] = dp[i - 1] + nums[i];
                }
            }else{
                dp[i] = Math.max(dp[i -1] + nums[i],dp[i - 3]);
            }
        }
        System.out.println(dp[dp.length - 1]);
    }
}
