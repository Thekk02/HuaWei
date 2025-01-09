package EVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 查找充电设备组合
 * @date 2024-12-27 11:23:12
 */
public class Q84 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int target = sc.nextInt();
        int[][] dp = new int[n + 1][target + 1];
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= target;j++){
                if(nums[i - 1] > j){
                    dp[i][j] = dp[i -1][j];
                }else{
                    dp[i][j] = Math.max(dp[i - 1][j],nums[i - 1] + dp[i - 1][j - nums[i - 1]]);
                }
            }
        }
        System.out.println(dp[n][target]);
    }
}
