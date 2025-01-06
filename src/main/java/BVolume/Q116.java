package BVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 跳格子1
 * @date 2025-1-4 11:10:38
 */
public class Q116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int len = nums.length;
        int[] dp = new int[len];
        if(len >= 1){
            dp[0] = nums[0];
        }
        if(len >= 2){
            dp[1] = Math.max(nums[0],nums[1]);
        }for(int i = 2;i < len;i++){
            dp[i] = Math.max(dp[i - 1],dp[i - 2] + nums[i]);
        }
        System.out.println(dp[len - 1]);
    }
}
